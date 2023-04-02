package de.andreasgerhard.oauth;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Base64;

public class RetrieveAccessToken {

    public OAuth2 updateToken(OAuth2 oAuth2) throws IOException, URISyntaxException, InterruptedException {
        if (oAuth2.accessToken() != null && oAuth2
                .valid()
                .isAfter(LocalDateTime.now())) {
            return oAuth2;
        }
        if (oAuth2.refreshToken() != null) {
            return updateByRefreshToken(oAuth2);
        }
        return initialRequest(oAuth2);
    }


    private OAuth2 initialRequest(OAuth2 oAuth2) throws IOException, InterruptedException, URISyntaxException {
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(new URI("https://api.etsy.com/v3/public/oauth/token"))
                .headers("Content-Type", "application/json;charset=UTF-8")
                .POST(HttpRequest.BodyPublishers.ofString(new InitialRequestAccessToken(oAuth2).toString()))
                .build();

        return retrieveResult(oAuth2, request);

    }

    private OAuth2 updateByRefreshToken(OAuth2 oAuth2) throws IOException, InterruptedException, URISyntaxException {
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(new URI("https://api.etsy.com/v3/public/oauth/token"))
                .headers("Content-Type", "application/json;charset=UTF-8")
                .POST(HttpRequest.BodyPublishers.ofString(new RequestRefreshAccessToken(oAuth2.clientId(), oAuth2.refreshToken()).toString()))
                .build();

        return retrieveResult(oAuth2, request);
    }


    @NotNull
    private static OAuth2 retrieveResult(OAuth2 oAuth2, HttpRequest request) throws IOException, InterruptedException {
        HttpResponse<String> response = HttpClient
                .newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() >= 200 && response.statusCode() < 300) {
            return mapTokenResultFromResponse(oAuth2, response);
        }
        Error error = mapErrorFromResponse(response);
        throw new RuntimeException(error.error);
    }

    @NotNull
    private static OAuth2 mapTokenResultFromResponse(OAuth2 oAuth2, HttpResponse<String> response) throws JsonProcessingException {
        String body = response.body();
        ObjectMapper mapper = new ObjectMapper();
        TokenResponse tokenResponse = mapper.readValue(body, TokenResponse.class);
        LocalDateTime valid = LocalDateTime
                .now()
                .plusSeconds(tokenResponse.getExpiresIn());

        return new OAuth2(
                oAuth2.clientId(),
                oAuth2.code(),
                oAuth2.codeVerify(),
                oAuth2.redirectUrl(),
                tokenResponse.getAccessToken(),
                tokenResponse.getRefreshToken(),
                valid);
    }

    @NotNull
    private static Error mapErrorFromResponse(HttpResponse<String> response) throws JsonProcessingException {
        String body = response.body();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(body, Error.class);
    }

    private static String generateCodeVerifier() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] codeVerifier = new byte[32];
        secureRandom.nextBytes(codeVerifier);
        return Base64
                .getUrlEncoder()
                .withoutPadding()
                .encodeToString(codeVerifier);
    }

    private static String generateCodeChallenge(String codeVerifier) throws NoSuchAlgorithmException {
        byte[] bytes = codeVerifier.getBytes(StandardCharsets.US_ASCII);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bytes, 0, bytes.length);
        byte[] digest = messageDigest.digest();
        return Base64
                .getUrlEncoder()
                .withoutPadding()
                .encodeToString(digest);
    }


    private record RequestRefreshAccessToken(String clientId, String refreshToken) {

        @Override
        public String toString() {
            String grantType = "refresh_token";
            return "{" +
                    "\"grant_type\": \"" + grantType + '\"' +
                    ",\"client_id\": \"" + clientId + '\"' +
                    ",\"refresh_token\":\"" + refreshToken + '\"' +
                    '}';
        }
    }

    private static class InitialRequestAccessToken {
        private final String redirectUrl;
        private final String code;
        private final String codeVerifier;
        private final String clientId;

        public InitialRequestAccessToken(OAuth2 oAuth2) {
            this.clientId = oAuth2.clientId();
            this.redirectUrl = oAuth2.redirectUrl();
            this.code = oAuth2.code();
            this.codeVerifier = oAuth2.codeVerify();
        }

        @Override
        public String toString() {
            String grantType = "authorization_code";
            return "{" +
                    "\"grant_type\": \"" + grantType + '\"' +
                    ",\"client_id\": \"" + clientId + '\"' +
                    ",\"redirect_uri\": \"" + redirectUrl + '\"' +
                    ",\"code\": \"" + code + '\"' +
                    ",\"code_verifier\": \"" + codeVerifier + '\"' +
                    '}';
        }
    }

    private static class TokenResponse {
        @JsonProperty(value = "refresh_token")
        private String refreshToken;
        @JsonProperty(value = "access_token")
        private String accessToken;
        @JsonProperty(value = "token_type")
        private String tokenType;
        @JsonProperty(value = "expires_in")
        private Integer expiresIn;

        public String getRefreshToken() {
            return refreshToken;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public String getTokenType() {
            return tokenType;
        }

        public Integer getExpiresIn() {
            return expiresIn;
        }
    }

    private static class Error {
        @JsonProperty(value = "error")
        private String error;

        public String getError() {
            return error;
        }
    }

}

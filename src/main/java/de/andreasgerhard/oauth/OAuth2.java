package de.andreasgerhard.oauth;

import java.time.LocalDateTime;

public record OAuth2(String clientId, String code, String codeVerify, String redirectUrl, String accessToken, String refreshToken, LocalDateTime valid) {
}

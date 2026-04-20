package com.technokratos.agona.dtos.response;

public class TokenCoupleResponse {
    private String refreshToken;
    private String accessToken;

    public TokenCoupleResponse() {}

    public TokenCoupleResponse(String refreshToken, String accessToken) {
        this.refreshToken = refreshToken;
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}

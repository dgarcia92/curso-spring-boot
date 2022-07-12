package com.cotsoft.market.domain.dto;

public class AuthenticaationResponse {

    private String jwt;

    public AuthenticaationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}

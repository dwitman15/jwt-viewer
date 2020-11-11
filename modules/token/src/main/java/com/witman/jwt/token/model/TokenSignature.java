package com.witman.jwt.token.model;

public class TokenSignature {
    private String signature;

    public TokenSignature(String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}

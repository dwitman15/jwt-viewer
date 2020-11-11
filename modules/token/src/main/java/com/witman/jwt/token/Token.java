package com.witman.jwt.token;

public class Token {
    private TokenHeader tokenHeader;
    private TokenPayload tokenPayload;
    private TokenSignature tokenSignature;

    public Token(TokenHeader tokenHeader, TokenPayload tokenPayload, TokenSignature tokenSignature) {
        this.setTokenHeader(tokenHeader);
        this.setTokenPayload(tokenPayload);
        this.setTokenSignature(tokenSignature);
    }

    public TokenHeader getTokenHeader() {
        return tokenHeader;
    }

    public void setTokenHeader(TokenHeader tokenHeader) {
        this.tokenHeader = tokenHeader;
    }

    public TokenPayload getTokenPayload() {
        return tokenPayload;
    }

    public void setTokenPayload(TokenPayload tokenPayload) {
        this.tokenPayload = tokenPayload;
    }

    public TokenSignature getTokenSignature() {
        return tokenSignature;
    }

    public void setTokenSignature(TokenSignature tokenSignature) {
        this.tokenSignature = tokenSignature;
    }
}

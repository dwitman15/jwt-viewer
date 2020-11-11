package com.witman.jwt.token.error;

public class ClaimCollisionException extends Exception {
    public ClaimCollisionException(String errorMessage) {
        super(errorMessage);
    }
}
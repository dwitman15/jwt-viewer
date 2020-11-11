package com.witman.jwt.token.claims;

import java.util.Set;

public class RegisteredClaims {
    public static final Set<String> CLAIMS = Set.of("iss", "sub", "aud", "exp", "nbf", "iat", "jti");

}

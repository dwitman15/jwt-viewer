package com.witman.jwt.token.claims;

import org.apache.commons.lang3.EnumUtils;

import java.util.Set;

public enum RegisteredClaims {
    ISS,
    SUB,
    AUD,
    EXP,
    NBF,
    IAT,
    JTI;

    public static Set<String> claims() {
        return EnumUtils.getEnumMap(RegisteredClaims.class).keySet();
    }
}

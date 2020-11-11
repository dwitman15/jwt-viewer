package com.witman.jwt.token;

import com.witman.jwt.token.claims.ClaimsValidator;
import com.witman.jwt.token.claims.PublicClaims;
import com.witman.jwt.token.claims.RegisteredClaims;

import java.util.HashMap;
import java.util.Map;

public class TokenPayload {
    private final Map<String, Object> registeredClaims = new HashMap<>();
    private final Map<String, Object> publicClaims = new HashMap<>();
    private final Map<String, Object> privateClaims = new HashMap<>();

    public TokenPayload(Map<String, Object> registeredClaims, Map<String, Object> publicClaims, Map<String, Object> privateClaims) {
        setRegisteredClaims(registeredClaims);
        setPublicClaims(publicClaims);
        setPrivateClaims(privateClaims);
    }

    public TokenPayload(Map<String, Object> claims) {
        setClaims(claims);
    }

    public Map<String, Object> getRegisteredClaims() {
        return registeredClaims;
    }

    public void setRegisteredClaims(Map<String, Object> registeredClaims) {
        for (Map.Entry<String, Object> entry : registeredClaims.entrySet()) {
            this.addRegisteredClaim(entry.getKey(), entry.getValue());
        }
    }

    public void addRegisteredClaim(String key, Object value) {
        ClaimsValidator.verifyRegisteredClaim(key);
        this.registeredClaims.put(key, value);
    }

    public Map<String, Object> getPublicClaims() {
        return publicClaims;
    }

    public void setPublicClaims(Map<String, Object> publicClaims) {
        for (Map.Entry<String, Object> entry : publicClaims.entrySet()) {
            this.addPublicClaim(entry.getKey(), entry.getValue());
        }
    }

    public void addPublicClaim(String key, Object value) {
        ClaimsValidator.verifyPublicClaim(key);
        this.publicClaims.put(key, value);
    }

    public Map<String, Object> getPrivateClaims() {
        return privateClaims;
    }

    public void setPrivateClaims(Map<String, Object> privateClaims) {
        for (Map.Entry<String, Object> entry : privateClaims.entrySet()) {
            this.addPrivateClaim(entry.getKey(), entry.getValue());
        }
    }

    public void addPrivateClaim(String key, Object value) {
        ClaimsValidator.verifyPrivateClaim(key);
        this.privateClaims.put(key, value);
    }

    public void addClaim(String key, Object value) {
        if (RegisteredClaims.CLAIMS.contains(key)) {
            addRegisteredClaim(key, value);
        } else if (PublicClaims.CLAIMS.contains(key)) {
            addPublicClaim(key, value);
        } else {
            addPrivateClaim(key, value);
        }
    }

    public void setClaims(Map<String, Object> claims) {
        for (Map.Entry<String, Object> entry : claims.entrySet()) {
            this.addClaim(entry.getKey(), entry.getValue());
        }
    }

    public Map<String, Object> getClaims() {
        Map<String, Object> mergedMap = new HashMap<>();

        mergedMap.putAll(getRegisteredClaims());
        mergedMap.putAll(getPublicClaims());
        mergedMap.putAll(getPrivateClaims());

        return mergedMap;
    }
}

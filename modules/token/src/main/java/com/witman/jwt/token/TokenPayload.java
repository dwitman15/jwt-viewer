package com.witman.jwt.token;

import com.witman.jwt.token.claims.PublicClaims;
import com.witman.jwt.token.claims.RegisteredClaims;
import com.witman.jwt.token.error.ClaimCollisionException;

import java.util.HashMap;
import java.util.Map;

public class TokenPayload {
    private Map<String, Object> registeredClaims = new HashMap<>();
    private Map<String, Object> publicClaims = new HashMap<>();
    private Map<String, Object> privateClaims = new HashMap<>();

    public Map<String, Object> getRegisteredClaims() {
        return registeredClaims;
    }

    public void setRegisteredClaims(Map<String, Object> registeredClaims) {
        this.registeredClaims = registeredClaims;
    }

    public void addRegisteredClaim(String key, Object value) {
        this.registeredClaims.put(key, value);
    }

    public Map<String, Object> getPublicClaims() {
        return publicClaims;
    }

    public void setPublicClaims(Map<String, Object> publicClaims) {
        this.publicClaims = publicClaims;
    }

    public void addPublicClaim(String key, Object value) {
        this.publicClaims.put(key, value);
    }

    public Map<String, Object> getPrivateClaims() {
        return privateClaims;
    }

    public void setPrivateClaims(Map<String, Object> privateClaims) {
        this.privateClaims = privateClaims;
    }

    public void addPrivateClaim(String key, Object value) {
        this.privateClaims.put(key, value);
    }

    public void addClaim(String key, Object value) {
        if (RegisteredClaims.claims().contains(key)) {
            addRegisteredClaim(key, value);
        }
        else if (PublicClaims.claims().contains(key)) {
            addPublicClaim(key, value);
        }
        else {
            addPrivateClaim(key, value);
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

package com.witman.jwt.token.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TokenHeader {
    public static final Set<String> STANDARD_FIELDS = Set.of("alg", "typ");

    private Map<String, Object> entries = new HashMap<>();

    public Map<String, Object> getEntries() {
        return entries;
    }

    public void setEntries(Map<String, Object> entries) {
        this.entries = entries;
    }

    public void addEntry(String key, Object value) {
        this.entries.put(key, value);
    }
}

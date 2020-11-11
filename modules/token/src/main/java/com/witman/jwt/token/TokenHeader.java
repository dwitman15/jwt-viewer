package com.witman.jwt.token;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TokenHeader {
    static final Set<String> STANDARD_FIELDS = Set.of("alg", "type");

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

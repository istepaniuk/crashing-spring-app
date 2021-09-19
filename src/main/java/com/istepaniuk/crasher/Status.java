package com.istepaniuk.crasher;

public class Status {
    private final String key;
    private final String value;

    public Status(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }
}

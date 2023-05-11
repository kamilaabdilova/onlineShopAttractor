package com.example.hw65.entity;

public enum Category {
    WOMAN("woman"),
    MAN("man");

    private String value;

    Category(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}

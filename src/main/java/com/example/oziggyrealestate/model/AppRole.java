package com.example.oziggyrealestate.model;

public enum AppRole {

    USER("user"),
    BUYER("buyer"),
    SELLER("seller"),
    AGENT("agent"),

    ADMINISTRATOR("admin");

    private final String value;


    AppRole(String value) {
        this.value = value;
    }
}

package com.eazybytes.object.demo;

public final class ImmutablePerson {

    private final String name;
    private final String occupation;

    public ImmutablePerson(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }
}

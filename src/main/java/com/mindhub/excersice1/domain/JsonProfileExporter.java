package com.mindhub.excersice1.domain;


import com.mindhub.excersice1.interfaces.IProfileExporter;

public class JsonProfileExporter implements IProfileExporter {
    @Override
    public void export(UserProfile profile) {
        System.out.println("Exporting profile to JSON: ");
        System.out.println(String.format("{\"username\": \"%s\"}", profile.getUserName()));
        System.out.println(String.format("{\"email\": \"%s\"}", profile.getEmail()));
    }
}

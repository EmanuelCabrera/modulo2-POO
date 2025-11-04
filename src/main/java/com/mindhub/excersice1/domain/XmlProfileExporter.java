package com.mindhub.excersice1.domain;

import com.mindhub.excersice1.interfaces.IProfileExporter;

public class XmlProfileExporter implements IProfileExporter{
    @Override
    public void export(UserProfile profile) {
        System.out.println("Exporting profile to XML: ");
        System.out.println(String.format("<username>%s</username>", profile.getUserName()));
        System.out.println(String.format("<email>%s</email>", profile.getEmail()));
    }
}

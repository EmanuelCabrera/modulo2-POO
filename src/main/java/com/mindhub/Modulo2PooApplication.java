package com.mindhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mindhub.domain.UserProfile;
import com.mindhub.domain.JsonProfileExporter;
import com.mindhub.domain.XmlProfileExporter;

@SpringBootApplication
public class Modulo2PooApplication {

    public static void main(String[] args) {
        SpringApplication.run(Modulo2PooApplication.class, args);
        UserProfile profile = new UserProfile();
        profile.setUserName("John Doe");
        profile.setEmail("john.doe@example.com");
        profile.setPassword("password");
        JsonProfileExporter exporter = new JsonProfileExporter();
        exporter.export(profile);
        XmlProfileExporter xmlExporter = new XmlProfileExporter();
        xmlExporter.export(profile);
    }
}

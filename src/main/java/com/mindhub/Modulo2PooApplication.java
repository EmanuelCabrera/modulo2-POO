package com.mindhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mindhub.excersice1.domain.UserProfile;
import com.mindhub.excersice1.domain.JsonProfileExporter;
import com.mindhub.excersice1.domain.XmlProfileExporter;
import com.mindhub.excersice2.domain.EmailNotification;
import com.mindhub.excersice2.domain.PushNotification;
import com.mindhub.excersice2.domain.SlackNotification;
import com.mindhub.excersice2.domain.SmsNotification;
import com.mindhub.excersice2.service.NotificationService;
import java.util.List;

@SpringBootApplication
public class Modulo2PooApplication {

    public static void main(String[] args) {
        ///Excersice 1
        SpringApplication.run(Modulo2PooApplication.class, args);
        UserProfile profile = new UserProfile();
        profile.setUserName("John Doe");
        profile.setEmail("john.doe@example.com");
        profile.setPassword("password");
        JsonProfileExporter exporter = new JsonProfileExporter();
        exporter.export(profile);
        XmlProfileExporter xmlExporter = new XmlProfileExporter();
        xmlExporter.export(profile);

        /////Excersice 2
        NotificationService notificationService = new NotificationService();
        notificationService.sendBatch(List.of(
            new EmailNotification("john.doe@example.com", "Hello, this is an email notification"),
            new PushNotification("user_admin", "Hello, this is a push notification"),
            new SmsNotification("011-12345678", "Hello, this is an SMS notification"),
            new SlackNotification("Emanuel", "Hello, this is a Slack notification")
        ));
    }
}

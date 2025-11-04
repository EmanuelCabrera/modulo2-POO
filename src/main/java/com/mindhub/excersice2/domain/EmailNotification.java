package com.mindhub.excersice2.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class EmailNotification extends Notification {
    
    private String subject;
    
    public EmailNotification(String recipient, String message, String subject) {
        super(recipient, message);
        this.subject = subject;
    }
    
    @Override
    public void send() {
        System.out.println("Email sent to " + getRecipient() + ": " + getMessage() + " Subject: " + getSubject());
    }
}

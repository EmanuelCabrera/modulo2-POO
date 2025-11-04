package com.mindhub.excersice2.domain;

public class EmailNotification extends Notification {
    
    public EmailNotification(String recipient, String message) {
        super(recipient, message);
    }
    
    @Override
    public void send() {
        System.out.println("Email sent to " + getRecipient() + ": " + getMessage());
    }
}

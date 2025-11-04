package com.mindhub.excersice2.domain;

public class SmsNotification extends Notification {
    
    public SmsNotification(String recipient, String message) {
        super(recipient, message);
    }
    
    @Override
    public void send() {
        System.out.println("SMS sent to " + getRecipient() + ": " + getMessage());
    }
}

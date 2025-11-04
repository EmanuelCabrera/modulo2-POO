package com.mindhub.excersice2.domain;

public class PushNotification extends Notification {
    
    public PushNotification(String recipient, String message) {
        super(recipient, message);
    }
    
    @Override
    public void send() {
        System.out.println("Push notification sent to " + getRecipient() + ": " + getMessage());
    }
}

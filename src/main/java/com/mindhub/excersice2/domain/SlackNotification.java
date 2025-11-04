package com.mindhub.excersice2.domain;

public class SlackNotification extends Notification {
    
    public SlackNotification(String recipient, String message) {
        super(recipient, message);
    }
    
    @Override
    public void send() {
        System.out.println("Slack notification sent to " + getRecipient() + ": " + getMessage());
    }
}

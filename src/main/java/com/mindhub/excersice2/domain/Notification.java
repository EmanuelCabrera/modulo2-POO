package com.mindhub.excersice2.domain;

import lombok.Data;

@Data
public abstract class Notification {
    private String recipient;
    private String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public abstract void send();
}

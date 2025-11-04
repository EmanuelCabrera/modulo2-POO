package com.mindhub.excersice2.service;

import java.util.List;

import com.mindhub.excersice2.domain.Notification;

public class NotificationService {
    
    public void sendBatch(List<Notification> notifications) {
        for (Notification notification : notifications) {
            notification.send();
        }
    }
}

package com.labconnect.service;

public class WhatsAppNotificationServiceImpl implements NotificationService{
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("[WA OUTBOND] Mengirim Wa ke " + recipient + ": " + message);
    }
}
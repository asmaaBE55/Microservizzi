package com.myrestaurant.store.communicationservice.communicationservice.service;

public interface NotificationService<M> {
     void sendMessage(M message);
}

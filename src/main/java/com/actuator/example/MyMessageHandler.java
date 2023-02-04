package com.actuator.example;

import org.springframework.messaging.MessageHandler;
import org.springframework.stereotype.Service;

@Service
public class MyMessageHandler implements MessageHandler {

    public void handleMessage(org.springframework.messaging.Message<?> message) throws org.springframework.messaging.MessagingException {
        for (String headerKey : message.getHeaders().keySet()) {
            System.out.println("Header: "+headerKey+"="+message.getHeaders().get(headerKey));
        }
        System.out.println("Payload: "+message.getPayload());
    }

}

package org.Personal.Consumer;

import org.springframework.stereotype.Component;

@Component
public class Consumer {

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }
}
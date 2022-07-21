package com.joaopinho.pocobserver;

import org.springframework.stereotype.Component;

@Component
public class ProductListener implements EventListener{
    @Override
    public void update(String eventType, String message) {
        System.out.println(eventType + " || " + message);
    }
}

package com.joaopinho.pocobserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations){
        for (String operation : operations){
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener){
        List<EventListener> users = listeners.get(eventType);
        if(!users.contains(listener)){
            users.add(listener);
        }
    }

    public void unsubscribe(String eventType, EventListener listener){
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, String message){
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users){
            listener.update(eventType, message);
        }
    }


}

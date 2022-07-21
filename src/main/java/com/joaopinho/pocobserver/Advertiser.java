package com.joaopinho.pocobserver;

import org.springframework.stereotype.Component;

@Component
public class Advertiser {
    public EventManager eventManager;
    private String message;

    public Advertiser(){
        this.eventManager = new EventManager("new product", "sale");
    }

    public void newProduct(String product){
        this.message = product;
        eventManager.notify("new product", product);
    }

    public void sale(String product){
        this.message = product;
        eventManager.notify("sale", product);
    }


}

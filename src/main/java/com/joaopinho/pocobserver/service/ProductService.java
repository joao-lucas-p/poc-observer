package com.joaopinho.pocobserver.service;

import com.joaopinho.pocobserver.Advertiser;
import com.joaopinho.pocobserver.ProductListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    Advertiser advertiser;

    @Autowired
    ProductListener productListener;

    public String newProduct(String product){
        advertiser.newProduct(product);
        return product;
    }

    public String sale(String product){
        advertiser.sale(product);
        return product;
    }

    public void subscribeSale(){
        advertiser.eventManager.subscribe("sale", productListener);
    }

    public void unsubscribeSale(){
        advertiser.eventManager.unsubscribe("sale", productListener);
    }
}

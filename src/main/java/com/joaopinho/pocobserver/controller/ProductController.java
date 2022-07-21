package com.joaopinho.pocobserver.controller;

import com.joaopinho.pocobserver.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PutMapping("/new")
    public String newProduct(@RequestBody String product){
        return productService.newProduct(product);
    }

    @PutMapping("/sale")
    public String sale(@RequestBody String product){
        return productService.sale(product);
    }

    @PutMapping("/subscribe-sale")
    public ResponseEntity<Boolean> subscribeSale(){
        productService.subscribeSale();
        return ResponseEntity.ok().build();
    }

    @PutMapping("/unsubscribe-sale")
    public ResponseEntity<Boolean> unsubscribeSale(){
        productService.unsubscribeSale();
        return ResponseEntity.ok().build();
    }
}

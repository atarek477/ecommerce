package com.ahmed.ecommerce.controllers;


import com.ahmed.ecommerce.services.ProductServices;
import com.ahmed.ecommerce.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
private final ProductServices productServices;

    public ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }

    @GetMapping("/api/product")
    public List<Product> getAllProductController(){
      return   productServices.getAllProduct();

    }

    @PostMapping("/api/product/insert")
    public void insertProductController(@RequestBody Product product){
        productServices.insertProduct(product);

    }



}

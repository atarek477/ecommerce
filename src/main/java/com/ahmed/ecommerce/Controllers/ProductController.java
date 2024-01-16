package com.ahmed.ecommerce.Controllers;


import com.ahmed.ecommerce.Services.ProductServices;
import com.ahmed.ecommerce.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public void insertProductController(Product product){
        productServices.insertProduct(product);

    }



}

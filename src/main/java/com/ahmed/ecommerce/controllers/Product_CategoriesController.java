package com.ahmed.ecommerce.controllers;

import com.ahmed.ecommerce.model.Product_Categories;
import com.ahmed.ecommerce.services.Product_CategoriesServices;
import com.ahmed.ecommerce.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class Product_CategoriesController {
    private final Product_CategoriesServices productCategoriesServices;

    public Product_CategoriesController(Product_CategoriesServices productCategoriesServices) {
        this.productCategoriesServices = productCategoriesServices;
    }

    @GetMapping("/api/search/{search}")
    public List<Product> SearchController(@PathVariable("search") String search){
        return productCategoriesServices.Search(search);


    }

    @GetMapping("/api/search/all/{search}")
    public List<Product_Categories> SearchAllController(@PathVariable("search") String search){
        return productCategoriesServices.SearchAll(search);


    }

}

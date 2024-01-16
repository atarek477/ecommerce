package com.ahmed.ecommerce.Controllers;

import com.ahmed.ecommerce.Services.Product_CategoriesServices;
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

}

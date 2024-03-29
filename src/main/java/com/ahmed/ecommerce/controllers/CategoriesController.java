package com.ahmed.ecommerce.controllers;

import com.ahmed.ecommerce.services.CategoriesServices;
import com.ahmed.ecommerce.model.Categories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriesController {
    private final CategoriesServices categoriesServices;




    public CategoriesController(CategoriesServices categoriesServices) {
        this.categoriesServices = categoriesServices;
    }
    @GetMapping("/api/categories")
    public List<Categories> getAllCategoriesController(){
        return categoriesServices.getAllCategories();

    }
    @PostMapping("/api/categories/insert")
    public void insertCategories(@RequestBody Categories categories){
        categoriesServices.insertCategories(categories);
    }
}

package com.ahmed.ecommerce.services;

import com.ahmed.ecommerce.dao.ICategories;
import com.ahmed.ecommerce.model.Categories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServices {
   private final ICategories iCategories;


    public CategoriesServices(ICategories iCategories) {
        this.iCategories = iCategories;
    }

    public List<Categories> getAllCategories(){
        return iCategories.getAllCategoriesDao();

    }

    public void insertCategories(Categories categories){
        iCategories.insertCategoriesDao(categories);
    }






}

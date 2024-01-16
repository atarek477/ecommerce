package com.ahmed.ecommerce.dao;

import com.ahmed.ecommerce.model.Categories;
import com.ahmed.ecommerce.model.Product;

import java.util.List;

public interface ICategories {
    List<Categories> getAllCategoriesDao();
    void insertCategoriesDao(Categories categories);


}

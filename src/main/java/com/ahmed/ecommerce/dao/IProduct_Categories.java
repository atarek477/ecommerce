package com.ahmed.ecommerce.dao;

import com.ahmed.ecommerce.model.Categories;
import com.ahmed.ecommerce.model.Product;

import java.util.List;

public interface IProduct_Categories {


   public List<Product> SearchDao(String search);
}

package com.ahmed.ecommerce.dao;

import com.ahmed.ecommerce.model.Product;

import java.util.List;

public interface IProductDao {
List<Product> getAllProductDao();
void insertProductDao(Product product);


}

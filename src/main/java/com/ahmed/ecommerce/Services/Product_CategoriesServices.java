package com.ahmed.ecommerce.Services;

import com.ahmed.ecommerce.dao.IProduct_Categories;
import com.ahmed.ecommerce.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Product_CategoriesServices {
private final IProduct_Categories iProductCategories;

    public Product_CategoriesServices(IProduct_Categories iProductCategories) {
        this.iProductCategories = iProductCategories;
    }
    public List<Product> Search(String search){
        return iProductCategories.SearchDao(search);

    }

}

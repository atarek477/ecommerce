package com.ahmed.ecommerce.services;

import com.ahmed.ecommerce.dao.IProduct_Categories;
import com.ahmed.ecommerce.exception.NotFoundException;
import com.ahmed.ecommerce.model.Product;
import com.ahmed.ecommerce.model.Product_Categories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Product_CategoriesServices {
private final IProduct_Categories iProductCategories;

    public Product_CategoriesServices(IProduct_Categories iProductCategories) {
        this.iProductCategories = iProductCategories;
    }
    public List<Product> Search(String search){
        List<Product> products = iProductCategories.SearchDao(search);

        if(products.isEmpty()){
            throw new NotFoundException("there is no result found [%s] ".formatted(search));
        }
        return products;
    }

    public List<Product_Categories> SearchAll(String search){

        List<Product_Categories> productCategories = iProductCategories.SearchAllDao(search);
        if (productCategories.isEmpty()) {
            throw new NotFoundException("there is no result found [%s] ".formatted(search));
        }
        return productCategories;
    }

}

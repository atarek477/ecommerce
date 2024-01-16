package com.ahmed.ecommerce.services;


import com.ahmed.ecommerce.dao.IProductDao;
import com.ahmed.ecommerce.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {
    private  final IProductDao iProductDao;


    public ProductServices(IProductDao iProductDao) {
        this.iProductDao = iProductDao;
    }


    public List<Product> getAllProduct(){

       return iProductDao.getAllProductDao();

    }

    public void insertProduct(Product product){

        iProductDao.insertProductDao(product);
    }

}

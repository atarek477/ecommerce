package com.ahmed.ecommerce.services;


import com.ahmed.ecommerce.dao.IProductDao;
import com.ahmed.ecommerce.exception.DatabaseInsertException;
import com.ahmed.ecommerce.exception.NotFoundException;
import com.ahmed.ecommerce.model.Product;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {
    private  final IProductDao iProductDao;


    public ProductServices(IProductDao iProductDao) {
        this.iProductDao = iProductDao;
    }


    public List<Product> getAllProduct(){

        List<Product> allProductDao = iProductDao.getAllProductDao();
        if(allProductDao.isEmpty()){

            throw new NotFoundException("no product found");
        }


        return allProductDao;

    }

    public void insertProduct(Product product){

        try {
            iProductDao.insertProductDao(product);
        } catch (DataAccessException ex) {
            throw new DatabaseInsertException("Error inserting product into the database", ex);
        }
    }

}

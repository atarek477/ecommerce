package com.ahmed.ecommerce.services;

import com.ahmed.ecommerce.dao.ICategories;
import com.ahmed.ecommerce.exception.DatabaseInsertException;
import com.ahmed.ecommerce.exception.NotFoundException;
import com.ahmed.ecommerce.model.Categories;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServices {
   private final ICategories iCategories;


    public CategoriesServices(ICategories iCategories) {
        this.iCategories = iCategories;
    }

    public List<Categories> getAllCategories(){
        List<Categories> allCategoriesDao = iCategories.getAllCategoriesDao();
          if(allCategoriesDao.isEmpty()){

              throw new NotFoundException("No categories found.");
          }
          return allCategoriesDao;
    }

    public void insertCategories(Categories categories){
        try {
            iCategories.insertCategoriesDao(categories);
        } catch (DataAccessException ex) {
            throw new DatabaseInsertException("Error inserting categories into the database", ex);
        }
    }






}

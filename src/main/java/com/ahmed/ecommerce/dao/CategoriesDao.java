package com.ahmed.ecommerce.dao;

import com.ahmed.ecommerce.RowMapper.CategoriesRawMapper;
import com.ahmed.ecommerce.model.Categories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriesDao implements ICategories{
    private final JdbcTemplate jdbcTemplate;
    private final CategoriesRawMapper categoriesRawMapper;

    public CategoriesDao(JdbcTemplate jdbcTemplate, CategoriesRawMapper categoriesRawMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.categoriesRawMapper = categoriesRawMapper;
    }

    @Override
    public List<Categories> getAllCategoriesDao() {
        return null;
    }

    @Override
    public void insertCategoriesDao(Categories categories) {

    }
}
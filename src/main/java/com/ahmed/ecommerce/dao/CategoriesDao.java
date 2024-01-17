package com.ahmed.ecommerce.dao;

import com.ahmed.ecommerce.rowmapper.CategoriesRowMapper;
import com.ahmed.ecommerce.model.Categories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriesDao implements ICategories{
    private final JdbcTemplate jdbcTemplate;
    private final CategoriesRowMapper categoriesRowMapper;

    public CategoriesDao(JdbcTemplate jdbcTemplate, CategoriesRowMapper categoriesRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.categoriesRowMapper = categoriesRowMapper;
    }

    @Override
    public List<Categories> getAllCategoriesDao() {
        var sql = """
                SELECT id,name FROM categories
                """;


        return jdbcTemplate.query(sql, categoriesRowMapper) ;
    }

    @Override
    public void insertCategoriesDao(Categories categories) {

        var sql = """
                INSERT INTO categories (name) VALUES (?)
                """;
        jdbcTemplate.update(sql,categories.getName());


    }
}

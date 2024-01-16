package com.ahmed.ecommerce.dao;


import com.ahmed.ecommerce.rowmapper.ProductRowMapper;
import com.ahmed.ecommerce.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDao implements IProductDao{
    private final JdbcTemplate jdbcTemplate;
    private final ProductRowMapper productRowMapper;


    public ProductDao(JdbcTemplate jdbcTemplate, ProductRowMapper productRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.productRowMapper = productRowMapper;
    }


    @Override
    public List<Product> getAllProductDao() {
        var sql = """
                SELECT id,name FROM product
                """;


        return jdbcTemplate.query(sql, productRowMapper) ;
    }

    @Override
    public void insertProductDao(Product product) {
        var sql = """
                INSERT INTO product (name) VALUES (?)
                """;
        jdbcTemplate.update(sql,product.getName());

    }
}

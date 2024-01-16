package com.ahmed.ecommerce.dao;

import com.ahmed.ecommerce.rowmapper.ProductRowMapper;
import com.ahmed.ecommerce.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class Product_CategoriesDao implements IProduct_Categories{

    private final JdbcTemplate jdbcTemplate;
    private final ProductRowMapper productRowMapper;

    public Product_CategoriesDao(JdbcTemplate jdbcTemplate, ProductRowMapper productRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.productRowMapper = productRowMapper;
    }

    @Override
    public List<Product> SearchDao(String search) {
        var sql = """
                SELECT DISTINCT p.id, p.name
                FROM product as p
                JOIN product_categories as pc ON p.id = pc.product_id
                JOIN categories as c ON c.id = pc.category_id
                WHERE LOWER(c.name) LIKE LOWER(?) OR LOWER(p.name) LIKE LOWER(?)
                GROUP BY p.id
                """;

        // Use jdbcTemplate.query with placeholders for parameters and the productRowMapper
        return jdbcTemplate.query(sql, new Object[]{search + "%", search + "%"}, productRowMapper);
    }


}

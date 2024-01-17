package com.ahmed.ecommerce.dao;

import com.ahmed.ecommerce.model.Product_Categories;
import com.ahmed.ecommerce.rowmapper.ProductRowMapper;
import com.ahmed.ecommerce.model.Product;
import com.ahmed.ecommerce.rowmapper.Product_CategoriesRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class Product_CategoriesDao implements IProduct_Categories{

    private final JdbcTemplate jdbcTemplate;
    private final ProductRowMapper productRowMapper;
    private final Product_CategoriesRowMapper productCategoriesRowMapper;


    public Product_CategoriesDao(JdbcTemplate jdbcTemplate, ProductRowMapper productRowMapper, Product_CategoriesRowMapper productCategoriesRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.productRowMapper = productRowMapper;
        this.productCategoriesRowMapper = productCategoriesRowMapper;
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

    @Override
    public List<Product_Categories> SearchAllDao(String search) {
        var sql = """
                SELECT p.id as product_id, p.name as product_name, STRING_AGG(c.name, ', ') as category_name
                FROM product as p
                JOIN product_categories as pc ON p.id = pc.product_id
                JOIN categories as c ON c.id = pc.category_id
                WHERE LOWER(c.name) LIKE LOWER(?) OR LOWER(p.name) LIKE LOWER(?)
                GROUP BY p.id, p.name;
                """;

        // Use jdbcTemplate.query with placeholders for parameters and the productRowMapper
        return jdbcTemplate
                .query(sql, new Object[]{search + "%", search + "%"}, productCategoriesRowMapper);
    }


}

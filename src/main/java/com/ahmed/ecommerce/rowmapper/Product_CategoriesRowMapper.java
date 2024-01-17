package com.ahmed.ecommerce.rowmapper;

import com.ahmed.ecommerce.model.Categories;
import com.ahmed.ecommerce.model.Product_Categories;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class Product_CategoriesRowMapper implements RowMapper <Product_Categories>{
    @Override
    public Product_Categories mapRow(ResultSet rs, int rowNum) throws SQLException {

        Product_Categories productCategories = new Product_Categories();
        productCategories.setProduct_id(rs.getInt("product_id"));
        productCategories.setProduct_name(rs.getString("product_name"));
        productCategories.setCategory_name(rs.getString("category_name"));
        return productCategories;

    }
}

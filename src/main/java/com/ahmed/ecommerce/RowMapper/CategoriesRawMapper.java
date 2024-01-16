package com.ahmed.ecommerce.RowMapper;

import com.ahmed.ecommerce.model.Categories;
import com.ahmed.ecommerce.model.Product;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class CategoriesRawMapper implements RowMapper<Categories> {
    @Override
    public Categories mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Categories categories = new Categories();
        categories.setId(resultSet.getInt("id"));
        categories.setName(resultSet.getString("name"));
        return categories;
    }
}
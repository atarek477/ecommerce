package com.ahmed.ecommerce.model;

import java.util.Objects;

public class Product_Categories {
private int product_id ;
private String product_name;


private String category_name;
    public Product_Categories() {

    }

    public Product_Categories(int product_id, String product_name, String category_name) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.category_name = category_name;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }



    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product_Categories that = (Product_Categories) o;
        return product_id == that.product_id  && Objects.equals(product_name, that.product_name) && Objects.equals(category_name, that.category_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_id, product_name,  category_name);
    }

    @Override
    public String toString() {
        return "Product_Categories{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", category_name='" + category_name + '\'' +
                '}';
    }


}

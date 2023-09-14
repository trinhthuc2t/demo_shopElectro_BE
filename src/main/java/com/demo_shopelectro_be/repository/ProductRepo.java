package com.demo_shopelectro_be.repository;

import com.demo_shopelectro_be.model.product.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product,Integer> {
    List<Product> findByNameContaining(String name);
    List<Product> findByCategoryId(int id);
    List<Product> findByBrandId(int id);
}

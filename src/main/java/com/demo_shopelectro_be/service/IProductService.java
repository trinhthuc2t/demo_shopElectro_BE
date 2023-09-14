package com.demo_shopelectro_be.service;

import com.demo_shopelectro_be.model.product.Product;

import java.util.List;

public interface IProductService extends IService<Product>{
    List<Product> findByCategoryId(int id);
    List<Product> findByBrandId(int id);
    List<Product> findByNameContaining (String name);
}

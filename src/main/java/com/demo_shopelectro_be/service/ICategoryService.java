package com.demo_shopelectro_be.service;

import com.demo_shopelectro_be.model.product.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
}

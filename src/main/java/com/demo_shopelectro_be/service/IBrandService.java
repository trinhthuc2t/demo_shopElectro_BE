package com.demo_shopelectro_be.service;

import com.demo_shopelectro_be.model.product.Brand;
import com.demo_shopelectro_be.model.product.Category;

import java.util.List;

public interface IBrandService {
    List<Brand> findAll();
}

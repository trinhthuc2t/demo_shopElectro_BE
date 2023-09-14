package com.demo_shopelectro_be.repository;

import com.demo_shopelectro_be.model.product.Brand;
import com.demo_shopelectro_be.model.product.Category;
import org.springframework.data.repository.CrudRepository;

public interface IBrandRepo extends CrudRepository<Brand,Integer> {
}

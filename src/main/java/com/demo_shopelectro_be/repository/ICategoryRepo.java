package com.demo_shopelectro_be.repository;

import com.demo_shopelectro_be.model.product.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepo extends CrudRepository<Category,Integer> {
}

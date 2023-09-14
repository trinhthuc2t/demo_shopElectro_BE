package com.demo_shopelectro_be.service.impl;
import com.demo_shopelectro_be.model.product.Category;
import com.demo_shopelectro_be.repository.ICategoryRepo;
import com.demo_shopelectro_be.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepo categoryRepo;
    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryRepo.findAll();
    }
}

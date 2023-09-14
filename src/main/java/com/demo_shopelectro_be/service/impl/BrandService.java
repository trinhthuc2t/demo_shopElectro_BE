package com.demo_shopelectro_be.service.impl;

import com.demo_shopelectro_be.model.product.Brand;
import com.demo_shopelectro_be.model.product.Category;
import com.demo_shopelectro_be.repository.IBrandRepo;
import com.demo_shopelectro_be.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandService  implements IBrandService {
    @Autowired
    IBrandRepo brandRepo;
    @Override
    public List<Brand> findAll() {
        return (List<Brand>) brandRepo.findAll();
    }
}

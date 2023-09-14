package com.demo_shopelectro_be.service.impl;

import com.demo_shopelectro_be.model.product.Product;
import com.demo_shopelectro_be.repository.ProductRepo;
import com.demo_shopelectro_be.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService {
    @Autowired
    ProductRepo productRepo;
    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepo.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepo.save(product);
    }

    @Override
    public void delete(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public Product findById(int id) {
        return productRepo.findById(id).get();
    }



    @Override
    public List<Product> findByCategoryId(int id) {
        return productRepo.findByCategoryId(id);
    }

    @Override
    public List<Product> findByBrandId(int id) {
        return productRepo.findByBrandId(id);
    }

    @Override
    public List<Product> findByNameContaining(String name) {
        return productRepo.findByNameContaining(name);
    }
}

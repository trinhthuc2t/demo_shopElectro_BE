package com.demo_shopelectro_be.service.impl;

import com.demo_shopelectro_be.model.product.Product;
import com.demo_shopelectro_be.repository.IProductRepo;
import com.demo_shopelectro_be.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepo IProductRepo;
    @Override
    public List<Product> findAll() {
        return (List<Product>) IProductRepo.findAll();
    }

    @Override
    public Product save(Product product) {
        return IProductRepo.save(product);
    }

    @Override
    public void delete(int id) {
        IProductRepo.deleteById(id);
    }

    @Override
    public Product findById(int id) {
        return IProductRepo.findById(id).get();
    }



    @Override
    public List<Product> findByCategoryId(int id) {
        return IProductRepo.findByCategoryId(id);
    }

    @Override
    public List<Product> findByBrandId(int id) {
        return IProductRepo.findByBrandId(id);
    }

    @Override
    public List<Product> findByNameContaining(String name) {
        return IProductRepo.findByNameContaining(name);
    }

}

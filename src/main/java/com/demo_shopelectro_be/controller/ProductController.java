package com.demo_shopelectro_be.controller;

import com.demo_shopelectro_be.model.product.Brand;
import com.demo_shopelectro_be.model.product.Category;
import com.demo_shopelectro_be.model.product.Product;
import com.demo_shopelectro_be.service.IBrandService;
import com.demo_shopelectro_be.service.ICategoryService;
import com.demo_shopelectro_be.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/products")
public class ProductController {
    @Autowired
    IProductService productService;

    @Autowired
    ICategoryService categoryService;
    @Autowired
    IBrandService brandService;

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/category/{id}")
    public List<Product> findAllByCategory(@PathVariable int id) {
        return productService.findByCategoryId(id);
    }

    @GetMapping("/brand/{id}")
    public List<Product> findAllByBrand(@PathVariable int id) {
        return productService.findByBrandId(id);
    }

    @GetMapping("/category")
    public List<Category> findAllCategory() {
        return categoryService.findAll();
    }

    @GetMapping("/brand")
    public List<Brand> findAllBrand() {
        return brandService.findAll();
    }

    @PostMapping("/admin")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/admin/{id}")
    public Product edit(@PathVariable int id) {
        return productService.findById(id);
    }

    @GetMapping("/admin/delete/{id}")
    public void delete(@PathVariable int id) {
        productService.delete(id);
    }

    @GetMapping("/search/{name}")
    public List<Product> search(@PathVariable String name) {
        return productService.findByNameContaining(name);
    }



}

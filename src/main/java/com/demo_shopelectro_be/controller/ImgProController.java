package com.demo_shopelectro_be.controller;

import com.demo_shopelectro_be.model.product.ImgPro;
import com.demo_shopelectro_be.model.product.Product;
import com.demo_shopelectro_be.service.IImgProService;
import com.demo_shopelectro_be.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/imgPro")
public class ImgProController {
    @Autowired
    IImgProService imgProService;
    @Autowired
    IProductService productService;
    @GetMapping
    public List<ImgPro> findAll() {
        return imgProService.findAll();
    }
    @GetMapping("/{id}")
    public List<ImgPro> findByProductId(@PathVariable int id){
        return imgProService.findByProductId(id);
    }


}

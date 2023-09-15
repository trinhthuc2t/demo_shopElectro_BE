package com.demo_shopelectro_be.service;

import com.demo_shopelectro_be.model.product.ImgPro;

import java.util.List;

public interface IImgProService {
    List<ImgPro> findAll();
    List<ImgPro> findByProductId(int id);
    ImgPro findById(int id);


}

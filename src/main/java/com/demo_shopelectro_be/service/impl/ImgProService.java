package com.demo_shopelectro_be.service.impl;

import com.demo_shopelectro_be.model.product.ImgPro;
import com.demo_shopelectro_be.repository.IImgProRepo;
import com.demo_shopelectro_be.service.IImgProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImgProService implements IImgProService {

    @Autowired
    IImgProRepo iImgProRepo;
    @Override
    public List<ImgPro> findAll() {
        return (List<ImgPro>) iImgProRepo.findAll();
    }

    @Override
    public List<ImgPro> findByProductId(int id) {
        return iImgProRepo.findByProductId(id);
    }

    @Override
    public ImgPro findById(int id) {
        return iImgProRepo.findById(id).get();
    }
}

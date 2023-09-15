package com.demo_shopelectro_be.repository;

import com.demo_shopelectro_be.model.product.ImgPro;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IImgProRepo extends CrudRepository<ImgPro,Integer> {
    List<ImgPro> findByProductId(int id);

}

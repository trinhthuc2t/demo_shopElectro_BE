package com.demo_shopelectro_be.service;

import com.demo_shopelectro_be.model.Comment;
import com.demo_shopelectro_be.model.product.Product;

import java.util.List;

public interface ICommentService extends IService<Comment>{
    List<Comment> findAllByProduct(Product product);
    void deleteByProductId(int productId);
}

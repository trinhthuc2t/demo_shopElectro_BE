package com.demo_shopelectro_be.service.impl;

import com.demo_shopelectro_be.model.Comment;
import com.demo_shopelectro_be.model.product.Product;
import com.demo_shopelectro_be.repository.ICommentRepo;
import com.demo_shopelectro_be.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService implements ICommentService {
    @Autowired
    ICommentRepo commentRepo;

    @Override
    public List<Comment> findAllByProduct(Product product) {
        return commentRepo.findAllByProduct(product);
    }

    @Override
    public void deleteByProductId(int productId) {
        commentRepo.deleteByProductId(productId);
    }

    @Override
    public List<Comment> findAll() {
        return (List<Comment>) commentRepo.findAll();
    }

    @Override
    public Comment save(Comment comment) {
        return commentRepo.save(comment);
    }

    @Override
    public void delete(int id) {
        commentRepo.deleteById(id);
    }

    @Override
    public Comment findById(int id) {
        return commentRepo.findById(id).get();
    }
}

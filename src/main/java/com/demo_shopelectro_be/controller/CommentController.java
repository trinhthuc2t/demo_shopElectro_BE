package com.demo_shopelectro_be.controller;

import com.demo_shopelectro_be.model.Comment;
import com.demo_shopelectro_be.model.product.Product;
import com.demo_shopelectro_be.service.ICommentService;
import com.demo_shopelectro_be.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("user/cmt/{productId}")
public class CommentController {
    @Autowired
    private ICommentService commentService;

    @Autowired
    private IProductService productService;

    @GetMapping

    public List<Comment> showAllComments(@PathVariable int productId) {
        Product product = productService.findById(productId);
        return commentService.findAllByProduct(product);
    }

    @PostMapping
    public Comment createComment(@PathVariable int productId, @RequestBody Comment comment) {
        Product product = productService.findById(productId);
        comment.setProduct(product);
        return commentService.save(comment);
    }

    @GetMapping("/{commentId}")
    public Comment edit(@PathVariable int commentId) {
        return commentService.findById(commentId);
    }
    @DeleteMapping("/{commentId}")
    public ResponseEntity<?> deleteComment(@PathVariable int commentId) {
        commentService.delete(commentId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

package com.demo_shopelectro_be.repository;

import com.demo_shopelectro_be.model.Comment;
import com.demo_shopelectro_be.model.product.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ICommentRepo extends CrudRepository<Comment,Integer> {
    @Query("SELECT c.account.id FROM Comment c WHERE c.product.id = :productId")
    List<Integer> findAccountIdsByProductId(@Param("productId") int productId);
    List<Comment> findAllByProduct(Product product);
    @Modifying
    void deleteByProductId(int productId);
}
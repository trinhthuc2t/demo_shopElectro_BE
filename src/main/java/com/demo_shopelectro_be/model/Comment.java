package com.demo_shopelectro_be.model;

import com.demo_shopelectro_be.model.account.Account;
import com.demo_shopelectro_be.model.product.Product;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "TEXT")
    private String cmt;
    private LocalDateTime createdAt;
    @ManyToOne
    private Account account;
    @ManyToOne
    private Product product;
}
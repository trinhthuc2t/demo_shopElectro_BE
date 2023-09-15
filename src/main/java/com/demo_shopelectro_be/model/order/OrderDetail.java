package com.demo_shopelectro_be.model.order;

import com.demo_shopelectro_be.model.account.Account;
import com.demo_shopelectro_be.model.product.Product;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantity;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Oder oder;

}
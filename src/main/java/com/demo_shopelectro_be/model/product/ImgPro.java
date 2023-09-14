package com.demo_shopelectro_be.model.product;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class ImgPro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    private Product product;

}

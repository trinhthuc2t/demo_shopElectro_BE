package com.demo_shopelectro_be.model.product;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
@Data

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String img;
    @Column(columnDefinition = "text")
    private String detail;
    private LocalDateTime date;

    @ManyToOne
    private Category category;
    @ManyToOne
    private Brand brand;}
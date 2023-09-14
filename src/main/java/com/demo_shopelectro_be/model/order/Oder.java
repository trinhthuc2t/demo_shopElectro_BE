package com.demo_shopelectro_be.model.order;

import com.demo_shopelectro_be.model.account.Account;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Entity
public class Oder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private LocalDateTime dateTime;
    private double total;
    @ManyToOne
    private Account account;
}
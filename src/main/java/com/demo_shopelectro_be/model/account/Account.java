package com.demo_shopelectro_be.model.account;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String fullName;
    private String img;
    private String phone;
    private String address;
    @ManyToOne
    private Role role;

}

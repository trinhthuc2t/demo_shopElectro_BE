package com.demo_shopelectro_be.model.dto;


import com.demo_shopelectro_be.model.account.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountToken {
    private int id;
    private String username;
    private String token;
    private String fullName;
    private String img;
    private String phone;
    private String address;
    private Role roles;
}


package com.demo_shopelectro_be.service;
import com.demo_shopelectro_be.model.account.Account;
import com.demo_shopelectro_be.model.product.Product;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IAccountService extends IService<Account>, UserDetailsService {
    Account findByUsername(String username);
      Account login(String username, String password);


}

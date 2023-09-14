package com.demo_shopelectro_be.service.impl;
import com.demo_shopelectro_be.model.account.Account;
import com.demo_shopelectro_be.repository.IAccountRepo;
import com.demo_shopelectro_be.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AccountService implements IAccountService {
    @Autowired
    IAccountRepo accountRepo;

    @Override
    public List<Account> findAll() {
        return (List<Account>) accountRepo.findAll();
    }

    @Override
    public Account save(Account account) {
        return accountRepo.save(account);
    }

    @Override
    public void delete(int id) {
        accountRepo.deleteById(id);
    }

    @Override
    public Account findById(int id) {
        return accountRepo.findById(id).get();
    }



    @Override
    public UserDetails loadUserByUsername(String username) {
        Account account = accountRepo.findByUsername(username);
        List<GrantedAuthority> roleList = new ArrayList<>();
        roleList.add(account.getRole());
        return new User(username, account.getPassword(), roleList);
    }


    @Override
    public Account findByUsername(String username) {
        return accountRepo.findByUsername(username);
    }

    @Override
    public Account login(String username, String password) {
        return accountRepo.login(username,password);
    }
}

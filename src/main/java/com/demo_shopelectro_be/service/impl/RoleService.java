package com.demo_shopelectro_be.service.impl;

import com.demo_shopelectro_be.model.account.Role;
import com.demo_shopelectro_be.repository.IRoleRepo;
import com.demo_shopelectro_be.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {
    @Autowired
    IRoleRepo roleRepo;
    @Override
    public List<Role> getAll() {
        return (List<Role>) roleRepo.findAll();
    }
}

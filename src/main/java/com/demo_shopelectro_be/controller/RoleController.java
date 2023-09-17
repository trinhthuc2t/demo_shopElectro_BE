package com.demo_shopelectro_be.controller;

import com.demo_shopelectro_be.model.account.Role;
import com.demo_shopelectro_be.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    IRoleService roleService;

    @RequestMapping
    public List<Role> getAll(){
        return roleService.getAll();
    }
}

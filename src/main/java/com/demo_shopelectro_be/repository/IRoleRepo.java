package com.demo_shopelectro_be.repository;

import com.demo_shopelectro_be.model.account.Role;
import org.springframework.data.repository.CrudRepository;

public interface IRoleRepo extends CrudRepository<Role,Integer> {
}

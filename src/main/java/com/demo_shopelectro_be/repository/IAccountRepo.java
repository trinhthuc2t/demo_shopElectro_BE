package com.demo_shopelectro_be.repository;

import com.demo_shopelectro_be.model.account.Account;
import com.demo_shopelectro_be.model.order.Oder;
import com.demo_shopelectro_be.model.product.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IAccountRepo extends CrudRepository<Account,Integer> {
    Account findByUsername(String username);
    @Query(nativeQuery = true, value = "select * from account where username=:username and password=:password")
    Account login(@Param("username") String username, @Param("password") String password);

List<Account> findByUsernameContaining(String name);
List<Account> findByFullNameContaining(String name);
}

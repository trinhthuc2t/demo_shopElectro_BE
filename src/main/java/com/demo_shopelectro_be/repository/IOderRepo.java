package com.demo_shopelectro_be.repository;

import com.demo_shopelectro_be.model.order.Oder;
import com.demo_shopelectro_be.model.order.OrderDetail;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IOderRepo extends CrudRepository<Oder,Integer> {
    List<Oder> findByAccountId(int id);
}

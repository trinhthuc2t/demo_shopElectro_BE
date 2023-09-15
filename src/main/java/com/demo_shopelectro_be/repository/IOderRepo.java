package com.demo_shopelectro_be.repository;

import com.demo_shopelectro_be.model.order.Oder;
import org.springframework.data.repository.CrudRepository;

public interface IOderRepo extends CrudRepository<Oder,Integer> {
}

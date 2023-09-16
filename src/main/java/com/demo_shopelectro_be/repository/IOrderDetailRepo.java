package com.demo_shopelectro_be.repository;

import com.demo_shopelectro_be.model.order.OrderDetail;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IOrderDetailRepo extends CrudRepository<OrderDetail,Integer> {
    List<OrderDetail> findByOderId(int id);
}

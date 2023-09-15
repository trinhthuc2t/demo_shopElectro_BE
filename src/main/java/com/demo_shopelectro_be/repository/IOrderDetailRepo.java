package com.demo_shopelectro_be.repository;

import com.demo_shopelectro_be.model.order.OrderDetail;
import org.springframework.data.repository.CrudRepository;

public interface IOrderDetailRepo extends CrudRepository<OrderDetail,Integer> {
}

package com.demo_shopelectro_be.service;

import com.demo_shopelectro_be.model.order.OrderDetail;

import java.util.List;

public interface IOrderDetailService extends IService<OrderDetail> {
    List<OrderDetail> findByOderId(int id);

}

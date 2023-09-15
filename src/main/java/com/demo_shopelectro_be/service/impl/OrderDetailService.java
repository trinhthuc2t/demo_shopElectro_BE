package com.demo_shopelectro_be.service.impl;

import com.demo_shopelectro_be.model.order.OrderDetail;
import com.demo_shopelectro_be.repository.IOrderDetailRepo;
import com.demo_shopelectro_be.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderDetailService implements IOrderDetailService {
    @Autowired
    IOrderDetailRepo orderDetailRepo;
    @Override
    public List<OrderDetail> findAll() {
        return (List<OrderDetail>) orderDetailRepo.findAll();
    }

    @Override
    public OrderDetail save(OrderDetail orderDetail) {
        return orderDetailRepo.save(orderDetail);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public OrderDetail findById(int id) {
        return null;
    }
}

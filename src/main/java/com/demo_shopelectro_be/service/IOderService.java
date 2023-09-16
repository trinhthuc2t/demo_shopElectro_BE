package com.demo_shopelectro_be.service;

import com.demo_shopelectro_be.model.order.Oder;

import java.util.List;

public interface IOderService extends IService<Oder> {
    List<Oder> findByAccountId(int id);

}

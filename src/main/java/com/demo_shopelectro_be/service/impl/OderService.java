package com.demo_shopelectro_be.service.impl;

import com.demo_shopelectro_be.model.order.Oder;
import com.demo_shopelectro_be.repository.IOderRepo;
import com.demo_shopelectro_be.service.IOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OderService implements IOderService {
   @Autowired
    IOderRepo oderRepo;
    @Override
    public List<Oder> findAll() {
        return (List<Oder>) oderRepo.findAll();
    }

    @Override
    public Oder save(Oder oder) {
        return oderRepo.save(oder);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Oder findById(int id) {
        return null;
    }

    @Override
    public List<Oder> findByAccountId(int id) {
        return oderRepo.findByAccountId(id);
    }
}

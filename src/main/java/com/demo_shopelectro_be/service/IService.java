package com.demo_shopelectro_be.service;

import java.util.List;

public interface IService <E>{
    List<E> findAll();
    E save(E e);
    void delete(int id);
    E findById(int id);

}

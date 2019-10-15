package com.example.springpracticedistribution.service;


import com.example.springpracticedistribution.storage.repository.entity.OrderEntity;

import java.util.List;

public interface OrderService {

    Long insertOrder(OrderEntity order);

//    R selectOrderById(Integer id);
//
//    List<OrderEntity> selectOrderyAll();
//
//    R synchronizedSelectOrderById(Integer id);
}

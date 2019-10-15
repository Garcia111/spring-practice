package com.example.springpracticedistribution.controller;


import com.example.springpracticedistribution.service.OrderService;
import com.example.springpracticedistribution.storage.repository.entity.OrderEntity;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：Cheng.
 * @date：Created in 15:00 2019/10/15
 */
@RestController
@RequestMapping(value = "/order")
@Api(value = "/order",description = "订单相关接口")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/test")
    public Long insertOrder(OrderEntity order){
        return orderService.insertOrder(order);
    }


//    @GetMapping("/selectid")
//    public ResponseBean<OrderEntity> selectOrderById(Integer id){
//        return orderService.selectOrderById(id);
//    }

}

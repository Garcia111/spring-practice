package com.example.springpracticedistribution.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：Cheng.
 * @date：Created in 15:00 2019/10/15
 */
@RestController
@RequestMapping(value = "/order")
@Api(value = "/session",description = "订单相关接口")
public class OrderController {
}

/*
 * Copyright (C) 2018 China Telecom System Integration Co., Ltd.
 * All rights reserved.
 */
package com.example.springpracticedistribution.controller;

import com.example.springpracticedistribution.bean.ResponseBean;
import com.example.springpracticedistribution.bean.ResponseBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 * Created on 2018/7/16.
 *
 * @author cuiwei
 * @since 1.0.0
 */
@Slf4j
@RestController
@RequestMapping("/ping")
public class PingController {

    @GetMapping
    public ResponseBean<String> ping() {
        RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
        long upTime = runtimeBean.getUptime();

        return ResponseBuilder.succeed(
                "00000",
                "成功",
                "pong, already up for " + upTime + " (ms)");
    }
}

package com.fuzamei.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: microservice-config-center
 * @description:
 * @author: Andy
 * @create: 2018-12-06 11:57
 **/
@RestController
@RequestMapping(value = "/config")
public class ConfigController {
    @Value("${foo.version}")
    private String version;

    @GetMapping(value = "/getConfig")
    public String getConfig() {
        return "从配置配置读到的配置文件为："+version;
    }
}

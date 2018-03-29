package com.spike.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author spike.lin
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${info.profile}")
    private String profile;

    @RequestMapping("/hello")
    public String from() {
        return this.profile;
    }
}

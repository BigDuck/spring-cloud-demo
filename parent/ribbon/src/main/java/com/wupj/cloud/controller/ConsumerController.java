package com.wupj.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author：WPJ587 2017/6/20 21:49.
 **/
@RestController
@RequestMapping("/ribbon")
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping(value = "/add")
    public String add() {
        return restTemplate.getForEntity("http://SERVICEONE/math/add?a=10&b=20", String.class).getBody();
    }
}

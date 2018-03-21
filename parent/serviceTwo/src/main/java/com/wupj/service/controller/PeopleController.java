package com.wupj.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：WPJ587 2018/3/21 21:34.
 **/
@RestController
@RequestMapping("/people")
public class PeopleController {
    @GetMapping(path = "/service")
    public String getService() {
        return "service-two";
    }

    @GetMapping(path = "/msg")
    public String msg() {
        return "msg";
    }

    @GetMapping(path = "/say")
    public String say(@RequestParam("msg") String msg) {
       /* try {
            // 模拟超时
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
       /* if (StringUtils.isNotBlank(msg)) {
            throw new RuntimeException("异常模拟");
        }*/
        return "say:" + msg;
    }
}

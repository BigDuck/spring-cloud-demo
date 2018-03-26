package com.wupj.service.controller;

import com.wpj.entity.People;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author：WPJ587 2018/3/21 21:34.
 **/
@RestController
@RequestMapping("/people")
public class PeopleController {
    Logger logger= LoggerFactory.getLogger(this.getClass());
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
        return "say:" + msg;
    }

    @GetMapping("/msg/{name}")
    public People people(@PathVariable("name") String name) {
        logger.info("用户名："+name);
        return new People(name, 1, true, 1000d, 50f);
    }
}

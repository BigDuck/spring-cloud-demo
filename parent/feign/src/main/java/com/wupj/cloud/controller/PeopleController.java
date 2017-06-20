package com.wupj.cloud.controller;

import com.wupj.cloud.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：WPJ587 2017/6/20 22:41.
 **/
@RestController
@RequestMapping("people")
public class PeopleController {
    @Autowired
    private PeopleService peopleService;
    @RequestMapping("/say")
    public String say(){
      return   peopleService.saySomething("xj");
    }
}

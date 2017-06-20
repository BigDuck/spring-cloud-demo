package com.wupj.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by WPJ587 on 2017/6/20.
 */
@FeignClient("serviceOne")
public interface PeopleService {
    @GetMapping("/people/msg")
    String saySomething(@RequestParam("msg") String msg);
}

package com.wupj.cloud.service;

import com.wpj.entity.People;
import com.wupj.cloud.service.impl.PeopleFeignServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  用户接口
 * @author WPJ587
 * @date 2017/6/20
 */
@FeignClient(value = "serviceTwo",fallback = PeopleFeignServiceImpl.class)
public interface PeopleService {
    /**
     * 测试正常情况下的接口
     * @param msg
     * @return
     */
    @GetMapping("/people/say")
    String saySomething(@RequestParam("msg") String msg);

    /**
     * 获取用户信息
     * @param name 用户名
     * @return 用户信息
     */
    @GetMapping("/people/msg/{name}")
    People findPeople(@PathVariable(name = "name")String name);

}

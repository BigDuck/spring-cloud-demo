package com.wupj.cloud.service;

import com.wupj.cloud.service.impl.PeopleFeignServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by WPJ587 on 2017/6/20.
 */
@FeignClient(value = "serviceTwo",fallback = PeopleFeignServiceImpl.class)
public interface PeopleService {
    /**
     * @param msg
     * @return
     */
    @GetMapping("/people/say")
    String saySomething(@RequestParam("msg") String msg);
}

package com.wupj.cloud.controller;

import com.wpj.entity.People;
import com.wpj.model.ResponseJson;
import com.wupj.cloud.serivce.PeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author：WPJ587 2017/6/20 21:49.
 **/
@RestController
@RequestMapping("/ribbon")
public class ConsumerController {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    PeopleService peopleService;

    @GetMapping(value = "/math/add")
    public String add() {
        return restTemplate.getForEntity("http://SERVICEONE/math/add?a=10&b=20", String.class).getBody();
    }

    /**
     * 模拟用户增加
     *
     * @return
     */
    @PostMapping("/people")
    public ResponseJson addPeople(People people) {
        logger.info("ribbon 模拟用户添加的接口" + people.toString());
        ResponseJson responseJson = peopleService.addPeople(people);
        return responseJson;
    }

    @DeleteMapping("/people")
    public ResponseJson deletePeople(People people) {
        ResponseJson responseJson;
        try {
            logger.info("模拟删除用户" + people.toString());
            responseJson = peopleService.deletePeople(people);
        } catch (Exception e) {
            logger.error("删除用户失败", e.getMessage(), e);
            responseJson = new ResponseJson(HttpStatus.INTERNAL_SERVER_ERROR, "删除用户失败");
        }
        return responseJson;
    }

}

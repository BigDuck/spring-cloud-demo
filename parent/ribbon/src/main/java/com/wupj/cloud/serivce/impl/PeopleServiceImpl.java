package com.wupj.cloud.serivce.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wpj.entity.People;
import com.wpj.model.ResponseJson;
import com.wupj.cloud.serivce.PeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author：WPJ587 2018/3/25 22:16.
 **/
@Service
public class PeopleServiceImpl implements PeopleService {
    Logger logger = LoggerFactory.getLogger(PeopleServiceImpl.class);
    @Autowired
    RestTemplate restTemplate;
    private String PEOPLE_URL = "http://SERVICEONE/";

    /**
     * 模拟调用失败是调用
     * @param people
     * @return
     */
    @HystrixCommand(fallbackMethod ="peopleException")
    @Override
    public ResponseJson addPeople(People people) {
        logger.info("模拟增加用户失败" + people.toString());
        ResponseEntity<ResponseJson> result = restTemplate.postForEntity(PEOPLE_URL + "people/add", people, ResponseJson.class);
        return result.getBody();
    }
    @HystrixCommand(fallbackMethod = "peopleException")
    @Override
    public ResponseJson deletePeople(People people) {
        logger.info("模拟删除用户"+people.toString());
        restTemplate.delete(PEOPLE_URL + "people/delete", people);
        return new ResponseJson("删除用户成功");
    }

    public ResponseJson peopleException(People people) {
        return new ResponseJson(HttpStatus.INTERNAL_SERVER_ERROR,"调用服务失败");
    }
}

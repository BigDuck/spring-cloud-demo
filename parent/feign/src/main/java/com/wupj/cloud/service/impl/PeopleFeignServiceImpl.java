package com.wupj.cloud.service.impl;

import com.wpj.entity.People;
import com.wupj.cloud.service.PeopleService;
import org.springframework.stereotype.Component;

/**
 * @author：WPJ587 2018/3/21 21:47.
 **/
@Component
public class PeopleFeignServiceImpl implements PeopleService {
    @Override
    public String saySomething(String msg) {
        return "nothing to say";
    }

    @Override
    public People findPeople(String name) {
        return null;
    }
}

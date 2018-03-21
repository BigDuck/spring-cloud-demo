package com.wupj.cloud.service.impl;

import com.wupj.cloud.service.PeopleService;
import org.springframework.stereotype.Service;

/**
 * @author：WPJ587 2018/3/21 21:47.
 **/
@Service
public class PeopleFeignServiceImpl implements PeopleService {
    @Override
    public String saySomething(String msg) {
        return "null";
    }
}

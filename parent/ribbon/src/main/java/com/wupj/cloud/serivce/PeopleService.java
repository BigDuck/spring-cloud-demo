package com.wupj.cloud.serivce;

import com.wpj.entity.People;
import com.wpj.model.ResponseJson;

/**
 * @author：WPJ587 2018/3/25 22:15.
 **/

public interface PeopleService {
    /**
     * 增加用户
     */
    ResponseJson addPeople(People people);

    /**
     * 删除用户
     * @param people 用户
     * @return
     */
    ResponseJson deletePeople(People people);
}

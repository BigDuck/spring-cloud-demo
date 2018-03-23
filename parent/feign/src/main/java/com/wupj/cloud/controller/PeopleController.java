package com.wupj.cloud.controller;

import com.wpj.model.ResponseJson;
import com.wupj.cloud.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：WPJ587 2017/6/20 22:41.
 **/
@RestController
@RequestMapping("people")
public class PeopleController extends BaseController{
    @Autowired
    private PeopleService peopleService;
    @RequestMapping("/say")
    public String say(){
      return   peopleService.saySomething("xj");
    }
    @GetMapping(path = "/msg/{name}")
    public ResponseJson people(@PathVariable("name")String name){
        ResponseJson responseJson=null;
        try {
            responseJson=new ResponseJson(peopleService.findPeople(name));
        }catch (Exception e){
            responseJson.setCode(HttpStatus.INTERNAL_SERVER_ERROR);
            responseJson.setMsg(e.getMessage());
        }
        return responseJson;
    }
}

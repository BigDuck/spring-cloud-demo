package wupj.service.one.controller;

import com.wpj.entity.People;
import com.wpj.exception.BussinessException;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：WPJ587 2017/6/4 21:20.
 **/
@RestController
@RequestMapping("/people")
public class PeopleMsgController {
    private final Logger logger = Logger.getLogger(getClass());


    @RequestMapping("/msg")
    public Object getUserName(String msg) {
        return "你好" + msg;
    }

    @RequestMapping("/service")
    public String getService() {
        return "service-one";
    }

    @PostMapping("/add")
    public void addPeople(People people) {
        logger.info("模拟添加用户" + people.toString());
        throw new BussinessException("模拟添加用户失败");
    }

    @DeleteMapping("/delete")
    public void deletePeople(People people) {
        logger.info("删除用户" + people.toString());
    }
}

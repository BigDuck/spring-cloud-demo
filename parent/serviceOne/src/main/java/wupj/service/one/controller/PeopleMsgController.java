package wupj.service.one.controller;

import org.apache.log4j.Logger;
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
        return "你好"+msg;
    }
    @RequestMapping("/service")
    public String getService(){
        return "service-one";
    }


}

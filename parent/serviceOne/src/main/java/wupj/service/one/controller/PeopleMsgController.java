package wupj.service.one.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：WPJ587 2017/6/4 21:20.
 **/
@RestController
@RequestMapping("/people")
public class PeopleMsgController {
    @RequestMapping("/msg")
    public Object getUserName(){
        return "wupj";
    }

}

package wupj.service.one.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaRegistration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：WPJ587 2017/6/20 21:57.
 **/
@RestController
@RequestMapping("/math")
public class MathController {
    private final Logger logger = Logger.getLogger(getClass());


    @Autowired
    private EurekaRegistration registration;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        String serviceId = registration.getServiceId();
        Integer r = a + b;
        logger.info("/add, :, service_id:" + serviceId + ", result:" + r);
        return r;
    }
}

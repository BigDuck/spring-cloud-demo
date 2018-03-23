package com.wupj.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 *  Feign 相当于一个模拟web请求的客户端吧，有点类似motan这类的rpc框架，
 *  但是这个走的是http协议
 * @author wupj
 */
@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
public class FeignApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(FeignApp.class,args);
    }
}

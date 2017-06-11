package com.wupj.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients
@EnableWebMvc
@EnableEurekaClient
@EnableCircuitBreaker

public class ServiceTwoApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ServiceTwoApp.class,args);
    }
}
package com.wupj.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 服务注册
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(DiscoveryApp.class,args);
    }
}

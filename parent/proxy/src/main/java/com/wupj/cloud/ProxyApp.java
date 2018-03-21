package com.wupj.cloud;

import com.wupj.cloud.com.MyFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ProxyApp {
    public static void main(String[] args) {
        SpringApplication.run(ProxyApp.class, args);
    }
    @Bean
    public MyFilter myFilter(){
        return new MyFilter();
    }
}

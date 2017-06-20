package wupj.service.one;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableWebMvc
public class ServiceOneApp
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(ServiceOneApp.class).web(true).run(args);
    }
}

package com.sam.springconfigclientservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({DbSettings.class, ServerSettings.class})
@SpringBootApplication
public class SpringConfigClientService1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigClientService1Application.class, args);
    }

}

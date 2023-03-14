package com.post.postconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PostconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostconsumerApplication.class, args);
    }

}

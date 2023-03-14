package com.post.postprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PostproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostproviderApplication.class, args);
    }

}

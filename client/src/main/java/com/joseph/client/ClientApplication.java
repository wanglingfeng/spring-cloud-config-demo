package com.joseph.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lfwang on 2016/11/15.
 */
@SpringBootApplication
@RestController
public class ClientApplication {

    @Value("${foo}")
    private String bar;

    public static void main(String... args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @RequestMapping("/")
    public String hello() {
        return "Hello " + bar + " !";
    }
}

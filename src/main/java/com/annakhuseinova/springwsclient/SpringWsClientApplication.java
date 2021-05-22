package com.annakhuseinova.springwsclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ws.config.annotation.EnableWs;

@EnableWs
@SpringBootApplication
public class SpringWsClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWsClientApplication.class, args);
    }

}

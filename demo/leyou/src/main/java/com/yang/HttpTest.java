package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HttpTest {

    public static void main(String[] args) {
        SpringApplication.run(HttpTest.class);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}

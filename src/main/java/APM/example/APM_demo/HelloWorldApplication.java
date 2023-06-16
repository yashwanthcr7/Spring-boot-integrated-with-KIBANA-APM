package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import co.elastic.apm.attach.ElasticApmAttacher;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
	ElasticApmAttacher.attach();   
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    @RestController
    public class HelloController {
        @GetMapping("/")
        public String hello() {
            return "Hello, World!";
        }
    }
}


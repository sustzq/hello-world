package com.example.demo;

import com.example.demo.service.HelloWorldService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.example");
        HelloWorldService HelloWorldService = (HelloWorldService)context.getBean("helloWorldService");

        //User.builder().age(10).name("张三").build();
    }

}

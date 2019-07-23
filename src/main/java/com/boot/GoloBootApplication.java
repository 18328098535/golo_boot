package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 同时拥有@ComponentScan、@Configuration、@EnableAutoConfiguration注解的功能
public class GoloBootApplication {

    /**
     * GL：启动类
     * @param args
     */
    public static void main(String[] args) {

        SpringApplication.run(GoloBootApplication.class, args);
    }

}

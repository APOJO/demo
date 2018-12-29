package com.telecommunication;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: lmf
 */
@SpringBootApplication
@MapperScan("com.telecommunication.dao")
@ComponentScan("com.telecommunication")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}


package com.mjt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @Description
 * @Author mjt
 * @Time 2022/6/25
 */
@EnableJpaAuditing
@SpringBootApplication
public class ForJpaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ForJpaApplication.class, args);
    }
}

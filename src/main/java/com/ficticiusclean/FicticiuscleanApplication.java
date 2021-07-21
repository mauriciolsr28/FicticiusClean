package com.ficticiusclean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = { "com.ficticiusclean" })
public class FicticiuscleanApplication {

    public static void main(String[] args) {
        SpringApplication.run(FicticiuscleanApplication.class, args);
    }
}

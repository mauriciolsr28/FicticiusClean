package com.ficticiusclean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.ficticiusclean" })
public class FicticiusCleanApplication {

    public static void main(String[] args) {
        SpringApplication.run(FicticiusCleanApplication.class, args);

    }
}

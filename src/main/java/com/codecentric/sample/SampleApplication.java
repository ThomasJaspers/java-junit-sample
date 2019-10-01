package com.codecentric.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("de.codecentric.sample")
public class SampleApplication {
    public static void main(String[] args) {
            SpringApplication.run(SampleApplication.class, args);
        }
}
#####

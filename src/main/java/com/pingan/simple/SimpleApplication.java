package com.pingan.simple;

import com.pingan.simple.BeanFactoryPostProcessors.CPU;
import com.pingan.simple.BeanFactoryPostProcessors.Computer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleApplication.class, args);
    }
}

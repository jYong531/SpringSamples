package com.pingan.simple;

import com.pingan.simple.Beans.BenzCar;
import com.pingan.simple.Beans.Engine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleApplication.class, args);
    }

    @Bean(initMethod = "start")
    BenzCar benzCar(Engine engine){
        BenzCar car = new BenzCar();
        car.setEngine(engine);
        return car ;
    }
}

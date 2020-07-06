package com.pingan.simple.Beans;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BenzCar {
    Engine engine;

    void start(){
        System.out.println("BenzCar start");
        engine.fire();
    }
}

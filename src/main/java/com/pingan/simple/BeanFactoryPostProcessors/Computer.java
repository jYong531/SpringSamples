package com.pingan.simple.BeanFactoryPostProcessors;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Setter
@Getter
public class Computer implements InitializingBean {

   /* 在spring装载完所有的bean的时候,会执行afterPropertiesSet*/
    CPU cpu;

    void start(){
        System.out.println("BenzCar start");
        cpu.calculate();
    }

    /*经实践，可以发现InitializingBean.afterPropertiesSet方法，优于initMethod（这里指start方法）执行*/
    public void afterPropertiesSet(){
        if(cpu == null){
            System.out.println("Computer's CPU not setting");
        }else{
            System.out.println("Computer's CPU installed");
        }
    }
}

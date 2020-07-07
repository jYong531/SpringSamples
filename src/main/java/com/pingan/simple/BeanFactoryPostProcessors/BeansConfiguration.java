package com.pingan.simple.BeanFactoryPostProcessors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

    @Bean(initMethod = "start")
    Computer computer(CPU cpu){
        Computer computer = new Computer();
        computer.setCpu(cpu);
        return computer ;
    }

    @Bean
    SpecialBeanForCpu specialBeanForCpu(){
        return new SpecialBeanForCpu();
    }
}

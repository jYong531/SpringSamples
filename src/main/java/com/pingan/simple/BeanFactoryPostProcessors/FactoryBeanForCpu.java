package com.pingan.simple.BeanFactoryPostProcessors;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class FactoryBeanForCpu implements FactoryBean<CPU>, InvocationHandler {
    public CPU getObject() {
        CPU proxy = (CPU)Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{CPU.class},this);
        return proxy;
    }

    @Override
    public Class<?> getObjectType() {
        return CPU.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args){
        System.out.println("here is invoke  engine:"+method.getName());
        return null;
    }
}

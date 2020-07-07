package com.pingan.simple.BeanFactoryPostProcessors;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class SpecialBeanForCpu  implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory){
        BeanDefinitionRegistry beanDefinitionRegistry = (BeanDefinitionRegistry)configurableListableBeanFactory;
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(FactoryBeanForCpu.class);
        genericBeanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
        genericBeanDefinition.setAutowireCandidate(true);
        beanDefinitionRegistry.registerBeanDefinition("cpu-01", genericBeanDefinition);
    }
}

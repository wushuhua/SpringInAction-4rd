package com.springinaction.knights;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * Created by zh on 2017-05-21.
 */
public class MyBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,
        BeanPostProcessor, InitializingBean, EnvironmentAware, DisposableBean {
    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName: " + s);
    }
    //==========================
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory:" + beanFactory.toString());
    }
    //==========================
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext:" + applicationContext.getApplicationName());
    }
    //==========================
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("beforeInitialization:" + s + ", " + o);
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("afterInitialization:" + s + ", " + o);
        return null;
    }
    //==========================
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet...");
    }
    //==========================
    @Override
    public void setEnvironment(Environment environment) {
        System.out.println(environment);
    }
    //==========================
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy()..");
    }
}

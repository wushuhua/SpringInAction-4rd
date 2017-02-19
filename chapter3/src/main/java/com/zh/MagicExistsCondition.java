package com.zh;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 实现Condition的类用于做bean创建的条件
 * Created by zh on 2017-02-19.
 */
public class MagicExistsCondition implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
//        DataSource dataSource = (DataSource) conditionContext.getBeanFactory().getBean("jndiDataSource");
        boolean registry = conditionContext.getRegistry().containsBeanDefinition("dataSource");
        try {
            Class<?> clazz = conditionContext.getClassLoader().loadClass("com.zh.DataSourceConfig");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Resource resource = conditionContext.getResourceLoader().getResource("datasource-config.xml");
        return conditionContext.getRegistry().containsBeanDefinition("jndiDataSource");
    }
}

package com.zh.config;

import com.zh.soundsystem.BlankDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * 配置类需指定属性源
 * Created by zh on 2017-02-20.
 */
@Configuration
@PropertySource("classpath:app.properties")
public class ExpressiveConfig {

    @Autowired
    private Environment environment;

    @Bean("bd")
    public BlankDisc blankDisc() {
        return new BlankDisc(environment.getProperty("disc.title"),
                environment.getProperty("disc.artist"));
    }
}

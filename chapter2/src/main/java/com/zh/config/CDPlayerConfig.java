package com.zh.config;

import com.zh.soundsystem.Ballad;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zh on 2017-02-13.
 */
@Configuration
@ComponentScan(basePackageClasses = Ballad.class)
public class CDPlayerConfig {
}

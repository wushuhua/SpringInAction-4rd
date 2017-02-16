package com.zh.config;

import com.zh.soundsystem.*;
import org.springframework.context.annotation.*;

/**
 * Created by zh on 2017-02-13.
 */
@Configuration
@ComponentScan(basePackageClasses = Ballad.class)
@Import(CDConfig.class)
@ImportResource("classpath:componentscan.xml")
public class CDPlayerConfig {

    @Bean
    public CompactDisc randomBeatlesCD() {
        int choice = (int) Math.floor(Math.random() * 4);
        if (choice == 0) {
            return new SgtPeppers();
        } else if (choice == 1) {
            return new WhiteAlbum();
        } else if (choice == 2) {
            return new HardDaysNeight();
        } else {
            return new Revolver();
        }
    }

    /** 自动装配sgtPeppers() */
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}

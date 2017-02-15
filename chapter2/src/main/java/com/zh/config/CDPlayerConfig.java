package com.zh.config;

import com.zh.soundsystem.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zh on 2017-02-13.
 */
@Configuration
@ComponentScan(basePackageClasses = Ballad.class)
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

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

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public CDPlayer anotherCDPlayer() {
        return new CDPlayer(sgtPeppers());
    }

    /** 自动装配sgtPeppers() */
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}

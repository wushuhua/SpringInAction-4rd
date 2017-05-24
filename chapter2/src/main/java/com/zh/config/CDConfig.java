package com.zh.config;

import com.zh.soundsystem.CDPlayer;
import com.zh.soundsystem.CompactDisc;
import com.zh.soundsystem.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zh on 2017-02-16.
 */
@Configuration
public class CDConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(compactDisc());
    }

    @Bean
    public CDPlayer anotherCDPlayer() {
        return new CDPlayer(compactDisc());
    }

    /**
     * 这里接受参数时spring会自动进行compactDisc的注入
     * @param compactDisc
     * @return
     */
    @Bean
    public CDPlayer myCDPlayer(CompactDisc compactDisc) {
        System.out.println(compactDisc);
        return new CDPlayer(compactDisc);
    }
}

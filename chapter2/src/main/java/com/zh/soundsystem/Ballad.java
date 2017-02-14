package com.zh.soundsystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @primary:在存在歧义时作为首选
 * Created by zh on 2017-02-14.
 */
@Component("ballad")
@Primary
public class Ballad implements CompactDisc {

    public void play() {
        System.out.println("singing...");
    }
}

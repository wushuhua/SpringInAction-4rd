package com.zh.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by zh on 2017-02-14.
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    @Autowired
    public CDPlayer (@Qualifier("ballad")CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        compactDisc.play();
    }
}

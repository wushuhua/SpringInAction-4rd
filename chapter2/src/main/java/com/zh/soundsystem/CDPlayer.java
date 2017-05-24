package com.zh.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by zh on 2017-02-14.
 */
@Component
@Qualifier("cdPlayer")
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired(required = false)
    public CDPlayer (@Qualifier("ballad")CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}

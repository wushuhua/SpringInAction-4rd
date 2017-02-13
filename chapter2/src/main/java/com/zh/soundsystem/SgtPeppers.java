package com.zh.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by zh on 2017-02-13.
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "Thr Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}

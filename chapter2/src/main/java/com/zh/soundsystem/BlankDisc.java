package com.zh.soundsystem;

import java.util.List;

/**
 * Created by zh on 2017-02-16.
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title) {
        this.title = title;
        this.artist = "me";
    }

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        if(tracks != null)
            for(String track : tracks)
                System.out.println(track);
    }
}

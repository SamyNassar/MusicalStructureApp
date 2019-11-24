package com.example.musicalstructureapp;

import java.io.Serializable;

public class Song implements Serializable {

    private String title, artist;
    private int imageResourceID;

    public Song(String songTitle, String songArtist, int songImageResourceID) {

        title = songTitle;
        artist = songArtist;
        imageResourceID = songImageResourceID;
    }


    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }
}

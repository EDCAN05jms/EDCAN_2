package com.example.setsn.edcan_2;

import android.graphics.drawable.Drawable;

/**
 * Created by setsn on 2018-05-14.
 */

public class ListviewItem {
    String name;
    String artist;
    Drawable image;

    public String getArtist() {
        return artist;
    }

    public Drawable getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }


}

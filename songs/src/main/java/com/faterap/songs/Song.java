/*
 * Copyright (C) 2018, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.songs
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 09/28/2018, tanminghui, Create file
 */

package com.faterap.songs;

public class Song implements Comparable<Song>{
    private String name;

    private String artist;

    private String album;

    private long year;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    /**
     * user THIS METHOD to sort songs
     * @param song
     * @return
     */
    @Override
    public int compareTo(Song song) {
        // ADD YOUR LOGIC
        return 0;
    }
}

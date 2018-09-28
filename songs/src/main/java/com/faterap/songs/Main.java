package com.faterap.songs;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args){

        File source = new File("test");
        SongController controller = new SongController(source);

        // add song
        Song song1 = new Song("name1", "artist1");
        Song song2 = new Song("name2", "artist2");
        Song song3 = new Song("name3", "artist3");
        Song song4 = new Song("name4", "artist4");

        controller.addSong(song1);

        // delete song
        controller.deleteSong(song1);

        // edit song
        Song newSong = new Song("song1", "newartist1");
        newSong.setYear(2018);
        controller.updateSong(song1, newSong);

        // get all songs
        List<Song> songs = controller.getAllSongs();

    }

}

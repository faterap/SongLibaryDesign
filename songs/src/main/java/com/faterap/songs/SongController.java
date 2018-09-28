/*
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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SongController {

    // file for saving songs data
    private File file;

    public SongController(File file) {
        this.file = file;
    }

    /**
     * add a new song to file
     *
     * @param song new song info
     */
    public void addSong(Song song) {
        // 使用文件流写入数据 (FileOutputStream.java)
        // ps: 文件流读写需要 try/catch 捕捉异常

        FileOutputStream out = null;
        try {
            out = new FileOutputStream(file);

            // ADD YOUR LOGIC HERE

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * delete song from file
     *
     * @param song song info
     */
    public void deleteSong(Song song) {
        // 使用文件流写入数据 (FileOutputStream.java)
        // ps: 文件流读写需要 try/catch 捕捉异常

        FileOutputStream out = null;
        try {
            out = new FileOutputStream(file);

            // ADD YOUR LOGIC HERE

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * update song information
     *
     * @param oldSong old song info
     * @param newSong new song info
     */
    public void updateSong(Song oldSong, Song newSong) {
        FileOutputStream out = null;
        FileInputStream in = null;
        try {
            out = new FileOutputStream(file);
            in = new FileInputStream(file);

            // ADD YOUR LOGIC HERE

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * sort songs in alphabetical order
     *
     * @param list
     */
    private void sortSongs(List<Song> list) {
        Collections.sort(list);
    }

    /**
     * get all songs from file
     *
     * @return
     */
    public List<Song> getAllSongs() {
        List<Song> songs = new ArrayList<>();

        FileOutputStream out = null;
        FileInputStream in = null;
        try {
            out = new FileOutputStream(file);
            in = new FileInputStream(file);

            // ADD YOUR LOGIC HERE

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // sort songs after getting song data
        sortSongs(songs);

        return songs;
    }
}

package com.rojan;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title,double duration)
    {
        if(findSong(title)>=0)
        {
            System.out.println("The song already exists.\n");
            return false;
        }
        this.songs.add(new Song(title,duration));
        return true;
    }

    private int findSong(String title)          //Returns the index of the song in the list
    {
        for (int i = 0; i < this.songs.size(); i++)
        {
            Song song = songs.get(i);
            if (song.getTitle().equals(title))
            {
                return i;
            }
        }
        return -1;
    }

    public boolean addSongToPlaylist(String title, LinkedList<Song> playlist)
    {
        int trackNumber = findSong(title);
        if (trackNumber>=0){
            Song songInList = songs.get(trackNumber);           //Gets the song object in the index trackNumber in the object given there
            playlist.add(songInList);
            System.out.println("Song: " + title + " added to playlist.");
            return true;
        }
        System.out.println("The song: " + title + " doesn't exist in album.");
        return false;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.artist;
    }
}

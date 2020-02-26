package com.rojan;

import java.awt.*;
import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("Dive","Ed Sheeran");
        album.addSong("Perfect",3.45);
        album.addSong("Dive",3.22);
        album.addSong("Shape of you",4.00);
        album.addSong("South of border",3.66);
        album.addSong("Antisocial",4.01);
        album.addSong("Gall Girl",3.22);
        albums.add(album);

        album = new Album("Sushant KC","Nepal");
        album.addSong("Muskurayera",3.33);
        album.addSong("Sathi",2.34);
        album.addSong("Aama",4.22);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addSongToPlaylist("Perfect",playlist);
        albums.get(0).addSongToPlaylist("Dive",playlist);
        albums.get(0).addSongToPlaylist("Hello World",playlist);    //Should'nt exist
        albums.get(0).addSongToPlaylist("Should Not exist",playlist);
        albums.get(1).addSongToPlaylist("Gall Girl",playlist);
        albums.get(1).addSongToPlaylist("Sathi",playlist);
        albums.get(1).addSongToPlaylist("Aama",playlist);

        play(playlist);





    }
    private static void play(LinkedList<Song> playlist)
    {
        ListIterator<Song> songsList = playlist.listIterator();
        if(playlist.size()==0)
        {
            System.out.println("Playlist Empty");
        }
        else {
            System.out.println("\nNow Playing : " + songsList.next().toString());
        }


        boolean choice = true,goingforward = true;
        int ch;
        menu();
        while(choice) {
            System.out.println("\nEnter your Choice: \n");
            ch = scanner.nextInt();
            switch (ch){

                case 1: choice = false;
                    break;
                case 2:
                    if (!goingforward){
                        songsList.next();
                        goingforward = true;
                    }
                    if(songsList.hasNext()) {
                        System.out.println("Now Playing: " + songsList.next().toString());
                    }else {
                        System.out.println("You have reached the end of the list.");
                        goingforward = false;
                    }
                    break;
                case 3:
                    if (goingforward)
                    {
                        songsList.previous();
                        goingforward = false;
                    }
                    if(songsList.hasPrevious())
                    {
                        System.out.println("Now playing: " + songsList.previous().toString());
                    }else {
                        System.out.println("You are at top of list");
                        goingforward = true;
                    }
                    break;
                case 4:
                    if(goingforward)
                    {
                        if(songsList.hasPrevious()) {
                            System.out.println("Now playing: " + songsList.previous().toString());
                            goingforward = false;
                        }else System.out.println("Top of list.");
                        break;
                    }
                    if(!goingforward)
                    {
                        if (songsList.hasNext()) {
                            System.out.println("Now Playing: " + songsList.next().toString());
                            goingforward = true;
                        }else
                            System.out.println("End of list.");
                    }
                    break;
                case 5:
                    if(goingforward)
                    {
                        System.out.println("Removing Song: " + songsList.previous().toString() );
                        songsList.remove();

                    }
                    if(!goingforward)
                    {
                        System.out.println("Removing: " + songsList.next().toString());
                        songsList.remove();
                    }
                    break;
                case 6:
                    printList(playlist);
                    break;
                case 0:
                    menu();
                    break;
                case 7:
                    if(albums.size()==0)
                    {
                        System.out.println("Album is empty.");
                        break;
                    }else {
                        for(int i=0;i<albums.size();i++) {
                            System.out.println("Album Name/Artist: " + albums.get(i).toString());
                        }
                        break;
                    }
            }


        }
    }

    private static void printList(LinkedList<Song> playlist){
        ListIterator<Song> songListIterator = playlist.listIterator();
       if(playlist.size()==0){
           System.out.println("List Empty.");
       }
       else
       {
           while(songListIterator.hasNext()){
               System.out.println("Song: " + songListIterator.next().toString());
           }
       }

    }

    private static void menu()
    {
        System.out.println("\n1.Quit");
        System.out.println("2.Skip Forward to next Song.");
        System.out.println("3.Move to previous song.");
        System.out.println("4.Replay the current song.");
        System.out.println("5.Remove the current song.");
        System.out.println("6.Print the list of playlist.");
        System.out.println("7.Print list of album.");
        System.out.println("0.Display Menu.");
    }
}

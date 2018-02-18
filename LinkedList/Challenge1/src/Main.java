/*
* Create a program that implements a playlist for songs
* Create a song class having title and duration for a song
* The program will have an album class containing a list of songs
* The albums will be stored in an ArrayList
* Songs from different albums can be added to the playlist and will appear in the list in the order they are added
* Once the songs have been added to the playlist, create a menu of options to:
*   Quit, Skip, forward, skip backwards, replay the current song.
*   List songs in the playlist
* A song must exit in an album before it can be added to the playlist
* As an option extra, provide an option to remove the current song from the playlist
* */

import java.util.*;

public class Main {
    // arrayList of album objects
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        // first album
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy Man", 4.3);
        album.addSong("Hold On", 5.6);
        album.addSong("Lady double healer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball Shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album); // add first album to album list

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.35);
        album.addSong("Lets Go", 3.45);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("COD", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album); // add first album to album list

        // add some songs to the playlist
        LinkedList<Song> playList = new LinkedList<Song>();
        // adding a song from the first album
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy Man", playList);
        albums.get(0).addToPlayList("Speed King", playList);
        albums.get(0).addToPlayList(9, playList);
        albums.get(0).addToPlayList(8, playList);
        albums.get(0).addToPlayList(3, playList);
        albums.get(0).addToPlayList(2, playList);
        albums.get(0).addToPlayList(24, playList);

        play(playList);

    }

    private static void printList(LinkedList<Song> list) {
        // use an iterator to loop through the list
        Iterator<Song> i = list.iterator();
        System.out.println("===============================");
        // while there's a next item
        while(i.hasNext()) {
            // show current record
            System.out.println(i.next());
        }
        System.out.println("===============================");
    }

    // play first song of playlist
    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    // forward
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing: " + listIterator.next().toString());
                    } else {
                        System.out.println("End of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    // going backwards
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing: " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                   printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions."
        );
    }
}

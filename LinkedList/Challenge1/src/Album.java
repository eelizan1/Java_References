//The program will have an album class containing a list of songs
//The albums will be stored in an ArrayList

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        // initialize arrayList
        this.songs = new ArrayList<Song>();
    }

    // add song to arrayList
    public boolean addSong(String title, double duration) {
        // check if song already exists
        if(findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    // check for song duplicates
    private Song findSong(String title) {
        // loop through every song in array list
        for(Song checkedSong: this.songs) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    // add album songs to playlist
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        // if track 5, then index is 5
        int index = trackNumber - 1;
        // if song exists
        if((index >= 0) && (index <= this.songs.size())) {
            // add to playlist
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    // adding just the track name
    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in the album");
        return false;
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

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
}

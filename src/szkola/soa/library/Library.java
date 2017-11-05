package szkola.soa.library;

import szkola.soa.model.Song;

import java.util.ArrayList;
import java.util.List;

public class Library {

  private List<Song> collection;

  public Library() {
    collection = new ArrayList<>();
  }

  public void addSong(Song song) {
    collection.add(song);
  }

  public Song getSongByTitle(String title) {
    for (Song song : collection) {
      if (song.getTitle().equalsIgnoreCase(title))
        return song;
    }
    return null;
  }

  public List<Song> getSongsByArtist(String artist) {
    List<Song> songsByArtist = new ArrayList<>();
    for (Song song : collection) {
      if (song.getArtist().equalsIgnoreCase(artist)){
        songsByArtist.add(song);
      }
    }
    return songsByArtist;
  }

  public void addSampleSongs() {

    collection.add(new Song("Please stop the music", "Album", "Rihanna", "3:02", "Pop", 2005));
    collection.add(new Song("aaaaa", "Album2", "Rihanna", "3:02", "Pop", 2008));
    collection.add(new Song("bbbbb", "yeah", "Guns&Roses", "3:02", "Pop", 1980));

  }

  public List<Song> getAllSongs() {

    return collection;

  }

  public List<Song> removeSongByTitle(String title) {

    for (Song song : collection) {
      if (song.getTitle().equalsIgnoreCase(title)) {
        collection.remove(song);
        return collection;
      }
    }
    return null;
  }
}

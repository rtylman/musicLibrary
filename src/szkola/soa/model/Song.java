package szkola.soa.model;

public class Song {

  private String title;
  private String album;
  private String artist;
  private String length;
  private String genre;
  private int year;

  public Song(String title, String album, String artist, String length, String genre, int year) {
    this.title = title;
    this.album = album;
    this.artist = artist;
    this.length = length;
    this.genre = genre;
    this.year = year;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}

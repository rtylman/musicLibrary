package szkola.soa;

import szkola.soa.exceptions.InvalidInputException;
import szkola.soa.library.Library;
import szkola.soa.model.Song;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class LibraryService {

  Library library = new Library();

  @WebMethod
  @WebResult(name = "song")
  public List<Song> addSampleSongsToLibrary() {

    library.addSampleSongs();
    List<Song> songs = library.getAllSongs();
    return songs;

  }

  @WebMethod
  @WebResult(name = "song")
  public String addSongToLibrary(@WebParam(name = "title") String title, @WebParam(name = "album") String album, @WebParam(name = "artist") String artist, @WebParam(name = "length") String length, @WebParam(name = "genre") String genre, @WebParam(name = "year") int year) throws InvalidInputException {

    if (!artist.isEmpty() && !title.isEmpty()) {

      library.addSong(new Song(title, album, artist, length, genre, year));
      Song song = library.getSongByTitle(title);
      return song.toString();

    } else {

      throw new InvalidInputException("Invalid input", "Artist or Title can't be empty");

    }
  }

  @WebMethod
  @WebResult(name = "song")
  public List<Song> getAllSongs() {

    return library.getAllSongs();

  }

  @WebMethod
  @WebResult(name = "song")
  public List<Song> getSongByTitle(@WebParam(name = "title") String title) throws InvalidInputException {

    if (!title.isEmpty()) {

      List<Song> songs = new ArrayList<>();
      songs.add(library.getSongByTitle(title));

      return songs;

    } else {

      throw new InvalidInputException("Invalid input", "Title can't be empty");

    }

  }


  @WebMethod
  @WebResult(name = "song")
  public List<Song> getSongsByArtist(@WebParam(name = "artist") String artist) throws InvalidInputException {

    if (!artist.isEmpty()) {

      List<Song> songs = library.getSongsByArtist(artist);
      return songs;

    } else {

      throw new InvalidInputException("Invalid input", "Name can't be empty");

    }
  }

  @WebMethod
  public String removeSongByTitle(@WebParam(name = "title") String title) throws InvalidInputException {

    if (!title.isEmpty()) {
      List<Song> songs = library.removeSongByTitle(title);
      if (songs == null) {
        return "No song found with title: " + title;
      } else {
        return "Done";
      }

    } else {

      throw new InvalidInputException("Invalid input", "Title can't be empty");

    }
  }

}

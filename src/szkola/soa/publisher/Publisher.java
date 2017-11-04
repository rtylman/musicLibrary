package szkola.soa.publisher;

import szkola.soa.LibraryService;

import javax.xml.ws.Endpoint;

public class Publisher {
  public static void main(String[] args) {

    Endpoint.publish("http://localhost:1111/musicLibrary", new LibraryService());

  }
}

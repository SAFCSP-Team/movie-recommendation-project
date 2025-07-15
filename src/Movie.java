import java.util.*;

class Movie {
    int id;
    String name;
    double rate;
    int year;
    String genre;

  
    public Movie(int id, String name, double rate, int year, String genre) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.year = year;
        this.genre = genre.toLowerCase();
    }
}

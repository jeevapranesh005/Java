package abstraction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

interface SearchByGenre {
    void searchByGenre(String genre);
}

interface SearchByTitle {
    void searchByTitle(String title);
}

class Movie {
    private String title;
    private String genre;
    private String language;
    private String description;

    public Movie(String title, String genre, String language, String description) {
        this.title = title;
        this.genre = genre;
        this.language = language;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void getMovieDetail() {
        System.out.println("Title : " + title);
        System.out.println("Language : " + language);
        System.out.println("Genre : " + genre);
        System.out.println("Description : " + description);
        System.out.println("-----------------------------");
    }
}

class Catalog implements SearchByTitle, SearchByGenre {
    private static Date lastUpdated;
    private static List<Movie> movieList = new ArrayList<>();

    @Override
    public void searchByTitle(String title) {
        for (Movie movie : movieList) {
            if (movie.getTitle().equals(title)) {
                movie.getMovieDetail();
            }
        }
    }

    @Override
    public void searchByGenre(String genre) {
        for (Movie movie : movieList) {
            if (movie.getGenre().equalsIgnoreCase(genre)) {
                movie.getMovieDetail();
            }
        }
    }

    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        Movie m1 = new Movie("varisu", "Drama", "Tamil", "varisu");
        Movie m2 = new Movie("BBB", "Story", "Tamil", "Dhurandhar");
        Movie m3 = new Movie("CCC", "Drama", "Malayalam", "loka - chapter 1");

        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);

       

       
        catalog.searchByTitle("BBB");
        System.out.println();
        System.out.println();
  

      
        catalog.searchByTitle("Varisu");
        System.out.println();
        System.out.println();
        catalog.searchByTitle("CCC");
    }
}

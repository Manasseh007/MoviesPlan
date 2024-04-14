package MyMoviePlan.MoviesPlan.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Movies")
public class Movie {

    @Id
    @Column(name = "MovieID")
    private int movieID;
    @Column(name = "Title")
    private String title;
    @Column(name = "Genre")
    private String genre;
    @Column(name = "Language")
    private String language;
    @Column(name = "Description")
    private String description;
    @Column(name = "ShowTime")
    private String showTime;
    @Column(name = "TicketPrice")
    private Double ticketPrice;

    public Movie() {}

    public Movie(int movieID, String title, String genre, String language, String description, String showTime, Double ticketPrice) {
        this.movieID = movieID;
        this.title = title;
        this.genre = genre;
        this.language = language;
        this.description = description;
        this.showTime = showTime;
        this.ticketPrice = ticketPrice;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieID=" + movieID +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", language='" + language + '\'' +
                ", description='" + description + '\'' +
                ", showTime='" + showTime + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}

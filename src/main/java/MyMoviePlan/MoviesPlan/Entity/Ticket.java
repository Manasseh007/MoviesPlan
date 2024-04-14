package MyMoviePlan.MoviesPlan.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tickets")
public class Ticket {
    @Id
    @Column(name = "TicketID")
    private int ticketID;
    @Column(name = "MovieID")
    private int movieID;
    @Column(name = "UserID")
    private int userId;
    @Column(name = "BookingTime")
    private String bookingTime;

    public Ticket() {}

    public Ticket(int ticketID, int movieID, int userID, String bookingTime) {
        this.ticketID = ticketID;
        this.movieID = movieID;
        this.userId = userID;
        this.bookingTime = bookingTime;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public int getUserID() {
        return userId;
    }

    public void setUserID(int userID) {
        this.userId = userID;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketID=" + ticketID +
                ", movieID=" + movieID +
                ", userID=" + userId +
                ", bookingTime='" + bookingTime + '\'' +
                '}';
    }
}

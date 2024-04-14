package MyMoviePlan.MoviesPlan.Repository;

import MyMoviePlan.MoviesPlan.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByGenre(String genre);
    List<Movie> findByLanguage(String language);

    List<Movie> findByTitle(String title);

    List<Movie> findByDescription(String description);

    //List<Movie> findByTicketprice(double ticketPrice);
}

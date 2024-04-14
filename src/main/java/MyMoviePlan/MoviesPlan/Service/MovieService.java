package MyMoviePlan.MoviesPlan.Service;

import MyMoviePlan.MoviesPlan.Entity.Movie;
import MyMoviePlan.MoviesPlan.Repository.MovieRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Movie not Found"));
    }
    public List<Movie> getMoviesByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }

    public List<Movie> getMoviesByLanguage(String language) {
        return movieRepository.findByLanguage(language);
    }

    public List<Movie> findByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }

    public List<Movie> findByLanguage(String language) {
        return movieRepository.findByLanguage(language);
    }

   /*
    public List<Movie> findByTitle(String title) {
        return movieRepository.findByTitle(title);
    }
    public List<Movie> findByTicketprice(double ticketPrice){
        return movieRepository.findByTicketprice(ticketPrice);
    }

     */

    // Adding other methods if needed
}

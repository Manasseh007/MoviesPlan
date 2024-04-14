package MyMoviePlan.MoviesPlan.Service;

import MyMoviePlan.MoviesPlan.Entity.Admin;
import MyMoviePlan.MoviesPlan.Entity.Movie;
import MyMoviePlan.MoviesPlan.Repository.AdminRepository;
import MyMoviePlan.MoviesPlan.Repository.MovieRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private MovieRepository movieRepository;

    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }
    public Admin findByPassword(String password) {
        return adminRepository.findByPassword(password);
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie editMovie(Long id, Movie movieDetails) {
        Movie movie = movieRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Movie Not Found"));
        movie.setTitle(movieDetails.getTitle());
        movie.setGenre(movieDetails.getGenre());
        movie.setLanguage(movieDetails.getLanguage());
        movie.setDescription(movieDetails.getDescription());
        movie.setShowTime(movieDetails.getShowTime());
        movie.setTicketPrice(movieDetails.getTicketPrice());

        return movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {
        Movie movie = movieRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Movie Not Found"));
        movieRepository.delete(movie);
    }
    // Adding Other methods if needed
}

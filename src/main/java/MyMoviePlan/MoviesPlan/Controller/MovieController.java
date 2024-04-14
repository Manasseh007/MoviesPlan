package MyMoviePlan.MoviesPlan.Controller;

import MyMoviePlan.MoviesPlan.Entity.Movie;
import MyMoviePlan.MoviesPlan.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

    @GetMapping("/genre/{genre}")
    public List<Movie> findByGenre(@PathVariable String genre) {
        return movieService.findByGenre(genre);
    }

    @GetMapping("/language/{language}")
    public List<Movie> findByLanguage(@PathVariable String language) {
        return movieService.findByLanguage(language);
    }

    // Will be adding necessary methods
}

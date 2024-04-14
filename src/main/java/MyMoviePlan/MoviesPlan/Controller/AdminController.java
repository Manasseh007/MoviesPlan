package MyMoviePlan.MoviesPlan.Controller;

import MyMoviePlan.MoviesPlan.Entity.Admin;
import MyMoviePlan.MoviesPlan.Entity.Movie;
import MyMoviePlan.MoviesPlan.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping(path = "/{username}")
    public Admin findByUsername(@PathVariable String username) {
        return adminService.findByUsername(username);
    }

    @PostMapping(path = "/movies")
    public Movie addMovie(@RequestBody Movie movie) {
        return adminService.addMovie(movie);
    }

    @PutMapping("/movies/{id}")
    public Movie editMovie(@PathVariable Long id, @RequestBody Movie movie) {
        return adminService.editMovie(id, movie);
    }

    @DeleteMapping("/movies/{id}")
    public void deleteMovie(@PathVariable Long id) {
        adminService.deleteMovie(id);
    }

    // Will be adding necessary
}

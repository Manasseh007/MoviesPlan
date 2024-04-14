package MyMoviePlan.MoviesPlan.Controller;

import MyMoviePlan.MoviesPlan.Entity.User;
import MyMoviePlan.MoviesPlan.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@PathVariable User user){
        return userService.saveUser(user);
    }

    @GetMapping("{username}")
    public User findByUsername(@PathVariable String username){
        return userService.findByUsername(username);
    }

    /*
    @PutMapping("/{username}")
    public User updateUser(@PathVariable String username, @RequestBody User updateUser) {
        return userService.updateUser(username, updateUser);
    }

     */

    @DeleteMapping("/{username}")
    public void deleteUser(@PathVariable String username) {
        userService.deleteUser(username);
    }

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Adding other methods
}

package MyMoviePlan.MoviesPlan.Service;

import MyMoviePlan.MoviesPlan.Entity.User;
import MyMoviePlan.MoviesPlan.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public User saveUser(User user) {
        //user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    /*
           public User updateUser(String username, User updateUser) {
               return userRepository.updateUser();
           }
       */
    public void deleteUser(String username) {
    }

    public List<User> getAllUsers()  {
        return userRepository.findAll();
    }

    /*
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    */

    // Adding other methods if needed
}

package MyMoviePlan.MoviesPlan.Repository;

import MyMoviePlan.MoviesPlan.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    //User updateUser();
}

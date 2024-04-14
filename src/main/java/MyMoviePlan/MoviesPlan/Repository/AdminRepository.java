package MyMoviePlan.MoviesPlan.Repository;

import MyMoviePlan.MoviesPlan.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);

    Admin findByPassword(String password);
}

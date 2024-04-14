package MyMoviePlan.MoviesPlan.Repository;

import MyMoviePlan.MoviesPlan.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByUserId(Long userId);
}

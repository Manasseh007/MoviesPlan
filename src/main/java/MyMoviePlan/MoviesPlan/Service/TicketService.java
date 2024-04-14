package MyMoviePlan.MoviesPlan.Service;

import MyMoviePlan.MoviesPlan.Entity.Ticket;
import MyMoviePlan.MoviesPlan.Repository.TicketRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> findByUserId(Long userId){
        return ticketRepository.findByUserId(userId);
    }

    public Ticket createticket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Ticket updateTicket(Long id, Ticket updatedTicket) {
        Ticket ticket = ticketRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Ticket Not Found"));
        return ticketRepository.save(ticket);
        //return ticketRepository.saveAll(id, updatedTicket);
    }

    public List<Ticket> getTicketsByUserId(Long userId) {
        return ticketRepository.findByUserId(userId);
    }

    //public void deleteTicket(Long id) {ticketRepository.delete(ticket);}

    public void deleteTicket(Long id) {
        Ticket ticket = ticketRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Ticket Not Found"));
        ticketRepository.delete(ticket);
    }

    // Adding necessary methods
}

package MyMoviePlan.MoviesPlan.Controller;

import MyMoviePlan.MoviesPlan.Entity.Ticket;
import MyMoviePlan.MoviesPlan.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/user/{userID}")
    public List<Ticket> findByUserId(@PathVariable Long userId) {
        return ticketService.findByUserId(userId);
    }

    @PostMapping("/")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.createticket(ticket);
    }

    @PutMapping("/{id}")
    public Ticket updateTicket(@PathVariable Long id, @RequestBody Ticket updatedTicket) {
        return ticketService.updateTicket(id, updatedTicket);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
        ticketService.deleteTicket(id);
    }

    // Will be adding necessary methods
}

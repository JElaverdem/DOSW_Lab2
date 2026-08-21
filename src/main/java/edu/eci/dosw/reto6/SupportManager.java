package eci.dosw.reto6;
import java.util.ArrayList;
import java.util.List;

public class SupportManager {
    private List<Ticket> tickets;
    private SupportHandler chainRoot;

    public SupportManager(SupportHandler chainRoot){
        this.tickets = new ArrayList<>();
        this.chainRoot = chainRoot;
    }
    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public void addTicked(Ticket ticket){
        addTicket(ticket);
    }
    public void processAllTickets(){
        for (Ticket ticket : tickets){
            if (!ticket.isResolved()){
                chainRoot.handleTicket(ticket);
            }
        }
    }
    public long getResolvedTicketsCount() {
        return tickets.stream()
                      .filter(Ticket::isResolved)
                      .count();
    }

    public long getPendingTicketsCount() {
        return tickets.stream()
                      .filter(t -> !t.isResolved())
                      .count();
    }

    public long getTicketsByLevel(TicketL level) {
        return tickets.stream()
                      .filter(t -> t.getLevel() == level)
                      .count();
    }

    public double getAveragePriorityOfResolved(){
        return tickets.stream()
                       .filter(Ticket::isResolved)
                       .mapToInt(t -> t.getPriority().ordinal()+1)
                       .average()
                       .orElse(0.0);

    }

}

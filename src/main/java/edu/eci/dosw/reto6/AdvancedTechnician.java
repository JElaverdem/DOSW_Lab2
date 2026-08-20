package edu.eci.dosw.reto6;

public class AdvancedTechnician extends SupportHandler{
    public AdvancedTechnician(String nameParam){
        super(nameParam);
    }

    public void handleTicket(Ticket ticket){
        if (ticket.getLevel() == TicketL.ADVANCED && ticket.getPriority() == TicketPriority.HIGH){
            ticket.markAsResolved(getName());
        }
    }
}

package edu.eci.dosw.reto6;

public class BasicTechnician extends SupportHandler{
    public BasicTechnician(String nameParam){
        super(nameParam);
    }

    @Override
    public void handleTicket(Ticket ticket){
        if (ticket.getLevel() == TicketL.BASIC && ticket.getPriority() == TicketPriority.LOW){
            ticket.markAsResolved(getName());
        }
        else if (getNext() != null){
            getNext().handleTicket(ticket);
        }
    }
}

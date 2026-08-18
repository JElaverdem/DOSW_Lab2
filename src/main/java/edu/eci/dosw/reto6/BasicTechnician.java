package eci.dosw.reto6;

public class BasicTechnician extends SupportHandler{
    public BasicTechnician(String nameParam){
        super(nameParam);
    }

    @Override
    public void handleTicket(Ticket ticket){
        if (ticket.getLevel().ordinal() <= TicketL.BASIC.ordinal() && ticket.getPriority().ordinal() <= TicketPriority.LOW.ordinal()){
            ticket.markAsResolved(getName());
        }
        else{
            ticket.escalated();
            getNext().handleTicket(ticket);
        }
    }
}

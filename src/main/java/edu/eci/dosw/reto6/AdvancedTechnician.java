package eci.dosw.reto6;

public class AdvancedTechnician extends SupportHandler{
    public AdvancedTechnician(String nameParam){
        super(nameParam);
    }

    public void handleTicket(Ticket ticket){
        if (ticket.getLevel().ordinal() <= TicketL.ADVANCED.ordinal() && ticket.getPriority().ordinal() <= TicketPriority.HIGH.ordinal()){
            ticket.markAsResolved(getName());
        }
        else{
            if (getNext() == null){
                ticket.markAsUnsolved();
            }
            else{
                ticket.escalated();
                getNext().handleTicket(ticket);
            }
        }
    }
}

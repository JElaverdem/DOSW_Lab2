package eci.dosw.reto6;

public class IntermediateTechnician extends SupportHandler{
    public IntermediateTechnician(String nameParam){
        super(nameParam);
    }

    @Override
    public void handleTicket(Ticket ticket){
        if (ticket.getLevel().ordinal() <= TicketL.INTERMEDIATE.ordinal() && ticket.getPriority().ordinal() < TicketPriority.MEDIUM.ordinal()){
            ticket.markAsResolved(getName());
        }
        else{
            ticket.escalated();
            getNext().handleTicket(ticket);
        }
    }
}

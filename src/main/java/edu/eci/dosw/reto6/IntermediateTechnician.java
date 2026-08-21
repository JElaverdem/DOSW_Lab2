package eci.dosw.reto6;

public class IntermediateTechnician extends SupportHandler{
    public IntermediateTechnician(String nameParam){
        super(nameParam);
    }

    @Override
    public void handleTicket(Ticket ticket){
        if (ticket.getLevel() == TicketL.INTERMEDIATE && ticket.getPriority() == TicketPriority.MEDIUM){
            ticket.markAsResolved(getName());
        }
        else if (getNext() != null){
            getNext().handleTicket(ticket);
        }
    }
}

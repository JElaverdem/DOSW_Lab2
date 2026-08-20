import eci.dosw.reto6.TicketL;
import eci.dosw.reto6.TicketPriority;

public class Ticket {
    private String description;
    private String resolvedBy;
    private TicketL level;
    private TicketPriority priority;
    private boolean resolved;
    public Ticket(String description, TicketL level, TicketPriority priority ){
        this.description=description;
        this.level=level;
        this.priority=priority;
        this.resolved=false;
        this.resolvedBy=null;
    }
    public void markAsResolved(String technicianName){
        this.resolved=true;
        this.resolvedBy=technicianName;
    }
    public String getDescription(){
        return this.description;
    }
    public TicketL getLevel(){
        return this.level;
    }
    public TicketPriority getPriority(){
        return this.priority;
    }
    public boolean isResolved(){
        return this.resolved;
    }
    public String getResolvedBy(){
        return this.resolvedBy;
    }
}

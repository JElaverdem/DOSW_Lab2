package eci.dosw.reto6;

public abstract class SupportHandler {
    private SupportHandler nextHandler;
    private String name;

    public SupportHandler(String nameParam){
        this.name = nameParam;
    }

    public String getName(){
        return this.name;
    }

    public void setNext(SupportHandler next){
        this.nextHandler = next;
    }

    public SupportHandler getNext(){
        return this.nextHandler;
    }

    public abstract void handleTicket(Ticket ticket);
}

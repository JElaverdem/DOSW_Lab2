package eci.dosw.reto7;

import java.time.LocalDateTime;

public class ActionRecord {
    private User user;
    private Command command;
    private boolean undone;
    private LocalDateTime timestamp;
    public ActionRecord(User user, Command command){
        this.user=user;
        this.command=command;
        this.undone=true;
        this.timestamp=LocalDateTime.now();
    }
    public boolean isUndone(){
        return this.undone;
    }
    public void markAsUndone(){
        this.undone=false;
    }
}

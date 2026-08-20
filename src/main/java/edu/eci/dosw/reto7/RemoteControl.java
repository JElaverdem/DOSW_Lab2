package edu.eci.dosw.reto7;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<ActionRecord> history;

    public RemoteControl() {
        this.history = new ArrayList<>();
    }

    public void executeCommand(Command command, User user) { 
        command.execute();
        ActionRecord record = new ActionRecord(user, command);
        history.add(record);
    }

    public void undoLast() {
        if (history.isEmpty()) {
            System.out.println("There aren't actions in the record");
            return;
        }
        
        for (int i = history.size() - 1; i >= 0; i--) {
            ActionRecord record = history.get(i);
            if (!record.isUndone()) {
                record.getCommand().undo(); 
                
                record.markAsUndone();
                return;
            }
        }
        System.out.println("All actions are disabled.");
    }

    public void printSummary() {
        for (ActionRecord record : history) {
            String estado = record.isUndone() ? "[UNDONE]" : "[ACTIVE]";
            System.out.println(estado + " Action by user: " + record.getUser().getName());
        }
    }
}
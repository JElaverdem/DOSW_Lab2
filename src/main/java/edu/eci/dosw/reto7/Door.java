package edu.eci.dosw.reto7;

public class Door {
    private boolean isOpen;

    public Door() {
        this.isOpen = false; 
    }

    public void setOpen(boolean open) {
        this.isOpen = open;
        if (open) {
            System.out.println("The door is now OPEN.");
        } else {
            System.out.println("The door is now CLOSED.");
        }
    }

    public boolean isOpen() {
        return isOpen;
    }
}
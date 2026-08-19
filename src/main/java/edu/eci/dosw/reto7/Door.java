package edu.eci.dosw.reto7;

public class Door {
    private boolean isOpen;

    public Door() {
        this.isOpen = false; 
    }

    public void setOpen(boolean open) {
        this.isOpen = open;
        if (open) {
            System.out.println("La puerta ahora está ABIERTA.");
        } else {
            System.out.println("La puerta ahora está CERRADA.");
        }
    }

    public boolean isOpen() {
        return isOpen;
    }
}
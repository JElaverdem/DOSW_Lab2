package eci.dosw.reto7;

public class OperateDoorCommand implements Command {
    private Door door;
    private boolean newState;
    private boolean previousState;

    public OperateDoorCommand(Door door, boolean open) {
        this.door = door;
        this.newState = open;
    }

    @Override
    public void execute() {
        this.previousState = door.isOpen();
        this.door.setOpen(newState);
    }

    @Override
    public void undo() {
        System.out.println("return the last state...");
        this.door.setOpen(previousState);
    }
}

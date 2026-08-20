package eci.dosw.reto7;

public interface Command {
    public abstract void execute();
    public abstract void undo();
}

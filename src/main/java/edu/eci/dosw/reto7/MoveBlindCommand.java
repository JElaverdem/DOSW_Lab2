package eci.dosw.reto7;

public class MoveBlindCommand implements Command{
    private WindowBlind blind;
    private int newPosition;
    private int previousPosition; 

    public MoveBlindCommand(WindowBlind blind, int position) {
            this.blind = blind;
            this.newPosition = position;
        }
    
    @override
    public void execute(){
        this.previousPosition = blind.getPosition();
        this.blind.setPosition(newPosition);
        System.out.println("the WindowsBlind has been moved to" + newPosition + "%");
        
    }
    @Override
    public void undo(){
        this.blind.setPosition(previousPosition);
        System.out.println("the WindowsBlind has been moved to" + previousPosition + "%");
    }
}

package eci.dosw.reto7;

public class TurnOnLightCommand implements Command{
    private Light light;

    public TurnOnLightCommand(Light newLight){
        this.light = newLight;
    }

    public void execute(){
        light.turnOn();
    }

    public void undo(){
        light.turnOff();
    }
}

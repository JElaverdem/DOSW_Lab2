package eci.dosw.reto3;

public abstract class LandVehicle implements Vehicle{
    protected int wheels;
    protected String terrainType;

    public LandVehicle(int wheels, String terrainType){
        this.wheels = wheels;
        this.terrainType = terrainType;
    }
    public int getWheels(){
        return wheels;
    }
}

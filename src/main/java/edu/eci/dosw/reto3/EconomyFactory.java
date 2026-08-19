package main.java.edu.eci.dosw.reto3;

import eci.dosw.reto3.LandVehicle;

public class EconomyFactory implements VehicleFactory{
    public LandVehicle createLandVehicle(String vehicle){
        LandVehicle LandVehicle= new LandVehicle(vehicle, "Economy", 30, 100, "no");
    }
    public AirVehicle createAirVehicle(String vehicle){
        AirVehicle AirVehicle= new AirVehicle(vehicle, "Economy", 30, 100, "no");
    }
    public WaterVehicle createWaterVechile(String vehicle){
        WaterVehicle WaterVehicle= new WaterVehicle(vehicle, "Economy", 30, 100, "no");
    }
}

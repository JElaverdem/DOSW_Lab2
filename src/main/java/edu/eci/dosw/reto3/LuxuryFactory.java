package main.java.edu.eci.dosw.reto3;

public class LuxuryFactory implements VehicleFactory{
    public LandVehicle createLandVehicle(String vehicle){
        LandVehicle LandVehicle= new LandVehicle(vehicle, "Luxury", 90, 300, "no");
    }
    public AirVehicle createAirVehicle(String vehicle){
        AirVehicle AirVehicle= new AirVehicle(vehicle, "Luxury", 90, 300, "no");
    }
    public WaterVehicle createWaterVechile(String vehicle){
        WaterVehicle WaterVehicle= new WaterVehicle(vehicle, "Luxury", 90, 300, "no");
    }
}

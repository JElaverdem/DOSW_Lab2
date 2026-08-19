package eci.dosw.reto3;

public class UsedFactory implements VehicleFactory{
    public LandVehicle createLandVehicle(String vehicle){
        LandVehicle LandVehicle= new LandVehicle(vehicle, "Used", 60, 200, "no");
    }
    public AirVehicle createAirVehicle(String vehicle){
        AirVehicle AirVehicle= new AirVehicle(vehicle, "Used", 60, 200, "no");
    }
    public WaterVehicle createWaterVechile(String vehicle){
        WaterVehicle WaterVehicle= new WaterVehicle(vehicle, "Used", 60, 200, "no");
    }
}

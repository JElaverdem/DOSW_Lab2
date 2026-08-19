package eci.dosw.reto3;

public interface VehicleFactory {
    Vehicle createAirVehicle(String vehicle);

    Vehicle createLandVehicle(String vehicle);

    Vehicle createWaterVechile(String vehicle);
}

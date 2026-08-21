package eci.dosw.reto3;

public class Car extends LandVehicle {
    public Car(String type, String category, double maxSpeed, double price, String specialEquipment) {
        super(type, category, maxSpeed, price, specialEquipment);
    }
    @Override
    public void start() {
        System.out.println("Starting the car engine...");
    }
    @Override
    public void stop() {
        System.out.println("Stopping the car engine...");
    }
    @Override
    public String getSpecs() {
        return "Automóvil (" + getCategory() + "). Maximum speed: " + getMaxSpeed() + " km/h. Equipment: " + getSpecialEquipment();
    }
}


package eci.dosw.reto3;
public class Bicycle extends LandVehicle {
    public Bicycle(String type, String category, double maxSpeed, double price, String specialEquipment) {
        super("Bicycle", category, maxSpeed, price, specialEquipment);
    }

    @Override
    public void start() {
        System.out.println("Starting to pedal the bicycle...");
    }

    @Override
    public void stop() {
        System.out.println("Braking the bicycle...");
    }

    @Override
    public String getSpecs() {
        return "Bicycle (" + getCategory() + "). Maximum speed: " + getMaxSpeed() + " km/h. Equipment: " + getSpecialEquipment();
    }

    @Override
    public String getSpecialEquipment() { return super.getSpecialEquipment(); }
}
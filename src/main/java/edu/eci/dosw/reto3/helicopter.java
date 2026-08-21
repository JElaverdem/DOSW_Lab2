package eci.dosw.reto3;
public class Helicopter extends AirVehicle {
    public Helicopter(String type, String category, double maxSpeed, double price, String specialEquipment) {
        super(type, category, maxSpeed, price, specialEquipment);
    }
    @Override
    public void start() {
        System.out.println("Staring the helicopter engine...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the helicopter engine...");
    }

    @Override
    public String getSpecs() {
        return "Helicopter (" + getCategory() + "). Maximum speed: " + getMaxSpeed() + " km/h. Equipment: " + getSpecialEquipment();
    }
    @Override
    public String getType() { return super.getType(); }

    @Override
    public String getCategory() { return super.getCategory(); }

    @Override
    public double getMaxSpeed() { return super.getMaxSpeed(); }

    @Override
    public double getPrice() { return super.getPrice(); }

    @Override
    public String getSpecialEquipment() { return super.getSpecialEquipment(); }
}
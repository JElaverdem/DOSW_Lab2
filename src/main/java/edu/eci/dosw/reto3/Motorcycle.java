package eci.dosw.reto3;
public class Motorcycle extends LandVehicle {
    public Motorcycle(String category, double maxSpeed, double price, String specialEquipment) {
        super("Motorcycle", category, maxSpeed, price, specialEquipment);
    }

    @Override
    public void start() {
        System.out.println("Starting the motorcycle engine...");
    }

    @Override
    public void stop() {
        System.out.println("Turning off the motorcycle engine...");
    }

    @Override
    public String getSpecs() {
        return "Motorcycle (" + getCategory() + "). Maximum speed: " + getMaxSpeed() + " km/h. Equipment: " + getSpecialEquipment();
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
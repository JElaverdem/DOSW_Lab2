package eci.dosw.reto3;
public class Motorboat extends WaterVehicle {
    public Motorboat(String category, double maxSpeed, double price, String specialEquipment) {
        super("Motorboat", category, maxSpeed, price, specialEquipment);
    }

    @Override
    public void start() {
        System.out.println("Starting the motorboat engines...");
    }

    @Override
    public void stop() {
        System.out.println("Turning off the motorboat engines...");
    }

    @Override
    public String getSpecs() {
        return "Motorboat (" + getCategory() + "). Maximum speed: " + getMaxSpeed() + " knots. Equipment: " + getSpecialEquipment();
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
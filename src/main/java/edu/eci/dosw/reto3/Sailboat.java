package eci.dosw.reto3;
public class Sailboat extends WaterVehicle {
    public Sailboat(String category, double maxSpeed, double price, String specialEquipment) {
        super("Sailboat", category, maxSpeed, price, specialEquipment);
    }

    @Override
    public void start() {
        System.out.println("Hoisting the sailboat sails...");
    }

    @Override
    public void stop() {
        System.out.println("Lowering the sailboat sails...");
    }

    @Override
    public String getSpecs() {
        return "Sailboat (" + getCategory() + "). Maximum speed: " + getMaxSpeed() + " knots. Equipment: " + getSpecialEquipment();
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
package eci.dosw.reto3;
public class JetSki extends WaterVehicle {
    public JetSki(String category, double maxSpeed, double price, String specialEquipment) {
        super("JetSki", category, maxSpeed, price, specialEquipment);
    }

    @Override
    public void start() {
        System.out.println("Starting the jet ski...");
    }

    @Override
    public void stop() {
        System.out.println("Turning off the jet ski...");
    }

    @Override
    public String getSpecs() {
        return "JetSki (" + getCategory() + "). Maximum speed: " + getMaxSpeed() + " knots. Equipment: " + getSpecialEquipment();
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
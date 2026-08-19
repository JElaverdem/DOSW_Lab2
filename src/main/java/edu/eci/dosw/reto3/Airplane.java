package eci.dosw.reto3;
public class Airplane extends AirVehicle {
    public Airplane(String category, double maxSpeed, double price, String specialEquipment) {
        super("Airplane", category, maxSpeed, price, specialEquipment);
    }

    @Override
    public void start() {
        System.out.println("Starting the airplane turbines...");
    }

    @Override
    public void stop() {
        System.out.println("Turning off the airplane turbines...");
    }

    @Override
    public String getSpecs() {
        return "Airplane (" + getCategory() + "). Maximum speed: " + getMaxSpeed() + " km/h. Equipment: " + getSpecialEquipment();
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
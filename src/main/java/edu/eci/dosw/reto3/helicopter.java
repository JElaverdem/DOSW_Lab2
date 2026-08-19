package eci.dosw.reto3;
public class Helicopter extends AirVehicle {
    public Helicopter(double maxAltitude, int engines) {
        super(maxAltitude, engines);
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
        return "Helicopter with " + engines + " engine. maximun high : " + getMaxAltitude() + " ft.";
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
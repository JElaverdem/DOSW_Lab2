package eci.dosw.reto3;

public abstract class AirVehicle implements Vehicle {
    private String type;
    private String category;
    private double maxSpeed;
    private double price;
    private String specialEquipment;

    protected double maxAltitude;
    protected int engines;

    public AirVehicle(String type, String category, double maxSpeed, double price, String specialEquipment, double maxAltitude, int engines) {
        this.type = type;
        this.category = category;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.specialEquipment = specialEquipment;
        this.maxAltitude = maxAltitude;
        this.engines = engines;
    }

    @Override
    public String getType() { return type; }

    @Override
    public String getCategory() { return category; }

    @Override
    public double getMaxSpeed() { return maxSpeed; }

    @Override
    public double getPrice() { return price; }

    @Override
    public String getSpecialEquipment() { return specialEquipment; }

    public double getMaxAltitude() { return maxAltitude; }

    public int getEngines() { return engines; }

    public abstract void start();
    public abstract void stop();
    public abstract String getSpecs();
}

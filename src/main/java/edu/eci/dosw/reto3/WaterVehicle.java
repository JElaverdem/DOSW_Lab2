package eci.dosw.reto3;

public abstract class WaterVehicle implements Vehicle {
    private String type;
    private String category;
    private double maxSpeed;
    private double price;
    private String specialEquipment;

    protected double maxKnots;
    protected double draft;

    public WaterVehicle(String type, String category, double maxSpeed, double price, String specialEquipment, double maxKnots, double draft) {
        this.type = type;
        this.category = category;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.specialEquipment = specialEquipment;
        this.maxKnots = maxKnots;
        this.draft = draft;
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

    public double getMaxKnots() { return maxKnots; }

    public double getDraft() { return draft; }

    public abstract void start();
    public abstract void stop();
    public abstract String getSpecs();
}


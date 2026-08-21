package eci.dosw.reto3;

public abstract class WaterVehicle implements Vehicle {
    private String type;
    private String category;
    private double maxSpeed;
    private double price;
    private String specialEquipment;

    public WaterVehicle(String type, String category, double maxSpeed, double price, String specialEquipment) {
        this.type = type;
        this.category = category;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.specialEquipment = specialEquipment;

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

    public abstract void start();
    public abstract void stop();
    public abstract String getSpecs();
}


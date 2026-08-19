public class Car extends LandVehicle {
    public Car(int wheels, String terrainType) {
        super(wheels, terrainType);
    }
    @Override
    public void start() {
        System.out.println("Starting the car engine...");
    }
    @Override
    public void stop() {
        System.out.println("Stopping the car engine...");
    }
    @Override
    public String getSpecs() {
        return "Automóvil de " + getWheels() + " ruedas, diseñado para terreno: " + terrainType;
    }
}


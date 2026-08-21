package eci.dosw.reto3;

public class EconomyFactory implements VehicleFactory{
    public EconomyFactory(){

    }
    
    public LandVehicle createLandVehicle(String vehicle){
        LandVehicle landVehicle = null;
        if (vehicle.equals("Car")){
            landVehicle = new Car(vehicle, "Economy", 30, 100, "no");
        }
        else if(vehicle.equals("Bicycle")){
            landVehicle = new Bicycle(vehicle, "Economy", 30, 100, "no");
        }
        else if(vehicle.equals("Motorcycle")){
            landVehicle = new Bicycle(vehicle, "Economy", 30, 100, "no");
        }
        return landVehicle;
    }

    public AirVehicle createAirVehicle(String vehicle){
        AirVehicle airVehicle = null;
        if (vehicle.equals("Airplane")){
            airVehicle = new Airplane(vehicle, "Economy", 30, 100, "no");
        }
        else if(vehicle.equals("Helicopter")){
            airVehicle = new Helicopter(vehicle, "Economy", 30, 100, "no");
        }
        else if(vehicle.equals("LightAircraft")){
            airVehicle = new LightAircraft(vehicle, "Economy", 30, 100, "no");
        }

        return airVehicle;
    }

    public WaterVehicle createWaterVechile(String vehicle){
        WaterVehicle waterVehicle = null;

        if (vehicle.equals("JetSki")){
            waterVehicle = new JetSki(vehicle, "Economy", 30, 100, "no");
        }
        else if(vehicle.equals("Motorboat")){
            waterVehicle = new Motorboat(vehicle, "Economy", 30, 100, "no");
        }
        else if(vehicle.equals("Sailboat")){
            waterVehicle = new Sailboat(vehicle, "Economy", 30, 100, "no");
        }

        return waterVehicle;
    }
}

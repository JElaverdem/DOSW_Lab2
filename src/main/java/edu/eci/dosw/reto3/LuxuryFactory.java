package eci.dosw.reto3;

public class LuxuryFactory implements VehicleFactory{
    public LuxuryFactory(){

    }
    public LandVehicle createLandVehicle(String vehicle){
        LandVehicle landVehicle = null;
        if (vehicle.equals("Car")){
            landVehicle = new Car(vehicle, "Luxury", 90, 300, "no");
        }
        else if(vehicle.equals("Bicycle")){
            landVehicle = new Bicycle(vehicle, "Luxury", 90, 300, "no");
        }
        else if(vehicle.equals("Motorcycle")){
            landVehicle = new Bicycle(vehicle, "Luxury", 90, 300, "no");
        }
        return landVehicle;
    }

    public AirVehicle createAirVehicle(String vehicle){
        AirVehicle airVehicle = null;
        if (vehicle.equals("Airplane")){
            airVehicle = new Airplane(vehicle, "Luxury", 90, 300, "no");
        }
        else if(vehicle.equals("Helicopter")){
            airVehicle = new Helicopter(vehicle, "Luxury", 90, 300, "no");
        }
        else if(vehicle.equals("LightAircraft")){
            airVehicle = new LightAircraft(vehicle, "Luxury", 90, 300, "no");
        }

        return airVehicle;
    }

    public WaterVehicle createWaterVechile(String vehicle){
        WaterVehicle waterVehicle = null;

        if (vehicle.equals("JetSki")){
            waterVehicle = new JetSki(vehicle, "Luxury", 90, 300, "no");
        }
        else if(vehicle.equals("Motorboat")){
            waterVehicle = new Motorboat(vehicle, "Luxury", 90, 300, "no");
        }
        else if(vehicle.equals("Sailboat")){
            waterVehicle = new Sailboat(vehicle, "Luxury", 90, 300, "no");
        }

        return waterVehicle;
    }
}

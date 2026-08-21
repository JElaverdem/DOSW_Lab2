package eci.dosw.reto3;

public class UsedFactory implements VehicleFactory{
    public UsedFactory(){

    }
    public LandVehicle createLandVehicle(String vehicle){
        LandVehicle landVehicle = null;
        if (vehicle.equals("Car")){
            landVehicle = new Car(vehicle, "Used", 60, 200, "no");
        }
        else if(vehicle.equals("Bicycle")){
            landVehicle = new Bicycle(vehicle, "Used", 60, 200, "no");
        }
        else if(vehicle.equals("Motorcycle")){
            landVehicle = new Bicycle(vehicle, "Used", 60, 200, "no");
        }
        return landVehicle;
    }

    public AirVehicle createAirVehicle(String vehicle){
        AirVehicle airVehicle = null;
        if (vehicle.equals("Airplane")){
            airVehicle = new Airplane(vehicle, "Used", 60, 200, "no");
        }
        else if(vehicle.equals("Helicopter")){
            airVehicle = new Helicopter(vehicle, "Used", 60, 200, "no");
        }
        else if(vehicle.equals("LightAircraft")){
            airVehicle = new LightAircraft(vehicle, "Used", 60, 200, "no");
        }

        return airVehicle;
    }

    public WaterVehicle createWaterVechile(String vehicle){
        WaterVehicle waterVehicle = null;

        if (vehicle.equals("JetSki")){
            waterVehicle = new JetSki(vehicle, "Used", 60, 200, "no");
        }
        else if(vehicle.equals("Motorboat")){
            waterVehicle = new Motorboat(vehicle, "Used", 60, 200, "no");
        }
        else if(vehicle.equals("Sailboat")){
            waterVehicle = new Sailboat(vehicle, "Used", 60, 200, "no");
        }

        return waterVehicle;
    }
}

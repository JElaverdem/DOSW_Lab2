package eci.dosw.reto3;

public class Reto3 {  
    public Reto3(){

    }

    public static void run(){
        Dealership dealer = new Dealership();

        System.out.println(dealer.calculateTotal());

        VehicleFactory factoryEconomic = new EconomyFactory();
        VehicleFactory factoryUsed = new UsedFactory();
        VehicleFactory factoryLuxury = new LuxuryFactory();

        dealer.orderVehicle(factoryUsed, "Air", "Helicopter");

        dealer.orderVehicle(factoryLuxury, "Land", "Car");

        dealer.orderVehicle(factoryEconomic, "Water", "Sailboat");

        System.out.println(dealer.getDescriptions());
        
        System.out.println(dealer.calculateTotal());
    }


}
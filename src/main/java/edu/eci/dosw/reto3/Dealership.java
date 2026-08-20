package eci.dosw.reto3;
import java.util.ArrayList;

public class Dealership {   
    private ArrayList<Vehicle> shoppingCart;

    public Dealership(){
        resetCart();
    }

    public void resetCart(){
        this.shoppingCart = new ArrayList<>();
    }

    public void orderVehicle(VehicleFactory factory, String type, String vehicle){
        if (factory != null && type != null && vehicle != null){
            if (type.equals("Air")){
                shoppingCart.add(factory.createAirVehicle(vehicle));
            }
            else if (type.equals("Land")){
                shoppingCart.add(factory.createLandVehicle(vehicle));
            }
            else if(type.equals("Water")){
                shoppingCart.add(factory.createWaterVechile(vehicle));
            }
        }
    }

    public double calculateTotal(){
        double total = shoppingCart.stream().mapToDouble(Vehicle::getPrice).sum();
        return total;
    }

    public String getDescriptions(){
        StringBuilder completeString = new StringBuilder();

        shoppingCart.stream().forEach(
                                x -> {
                                    completeString.append(x.getType());
                                    completeString.append("\n");
                                    completeString.append(x.getCategory());
                                    completeString.append("\n");
                                    completeString.append(x.getMaxSpeed());
                                    completeString.append("\n");
                                    completeString.append(x.getPrice());
                                    completeString.append("\n");
                                    completeString.append(x.getSpecialEquipment());
                                    completeString.append("\n");
                                    completeString.append("\n");
                                }
        );

        return completeString.toString();
    }
    
}

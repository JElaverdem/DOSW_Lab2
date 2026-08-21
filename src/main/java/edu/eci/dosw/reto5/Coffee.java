package eci.dosw.reto5;
import java.util.ArrayList;


public class Coffee {
    private ArrayList<Topping> toppings;
    private String description;
    
    public Coffee(){
        this.toppings = new ArrayList<>();
        this.description = "There is no description for this coffee";
    }

    public ArrayList<Topping> getToppings(){
        return this.toppings;
    }

    public void setToppings(ArrayList<Topping> top){
        this.toppings = top;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    
    public double getTotalPrice(){
        double total = toppings.stream().mapToDouble(Topping::getPrice).sum();

        return total;
    }
}

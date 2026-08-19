package main.java.edu.eci.dosw.reto2;

import java.util.ArrayList;
import java.util.List;

import main.java.edu.eci.dosw.reto2.Ingredient;


public class Hamburger {
    List<Ingredient> ingredients;
    public Hamburger() { 
        ingredients = new ArrayList<>();
    }
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    public double calculatePrice() {
        double totalPrice = 0;
        for (Ingredient ingredient : ingredients) {
            totalPrice += ingredient.getprice();
        }
        return totalPrice;
    }
    public String getsummary(){
        String summary = "your hamburger contains: ";
        for (Ingredient ingredient : ingredients) {
            summary += ingredient.getname() + " ($" + ingredient.getprice() + ")\n "; }
        summary += "Total: $" + calculatePrice();
        return summary;
    }
    
    /**
     * Method needed to set the ingredients of the burger after being built
     */
    public void setIngredients(ArrayList ingred){
        this.ingredients = ingred;
    }
}

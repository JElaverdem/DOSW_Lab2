package main.java.edu.eci.dosw.reto2;
import java.util.ArrayList;

public class StandardHamburgerBuilder extends HamburgerBuilder{
    private ArrayList<Ingredient> ingredients;

    public StandardHamburgerBuilder(){
        super();
        this.ingredients = new ArrayList<>();
    }

    public void addBread(Ingredient bread){
        this.ingredients.add(bread);
    }

    public void addMeat(Ingredient meat){
        this.ingredients.add(meat);
    }

    public void addCheese(Ingredient cheese){
        this.ingredients.add(cheese);
    }

    public void addSauce(Ingredient sauce){
        this.ingredients.add(sauce);
    }

    @Override
    public Burger build(){
        Burger result = super.build();
        result.addIngredients(this.ingredients);
        
        return result;
    }
}

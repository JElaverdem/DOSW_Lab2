package main.java.edu.eci.dosw.reto2;

public abstract class HamburgerBuilder implements FoodBuilder{
    protected Burger burger;

    public HamburgerBuilder(){
        this.reset();
    }

    public void reset(){
        this.burger = new Burger();
    }

    public abstract void addBread(Ingredient bread);

    public abstract void addMeat(Ingredient meat);

    public abstract void addCheese(Ingredient cheese);

    public abstract void addSauce(Ingredient sauce);

    public Burger build(){
        Burger result = this.burger;
        this.reset();

        return result;
    }
}
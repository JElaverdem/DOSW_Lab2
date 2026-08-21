package eci.dosw.reto2;

public abstract class HamburgerBuilder implements FoodBuilder{
    protected Hamburger burger;

    public HamburgerBuilder(){
        this.reset();
    }

    public void reset(){
        this.burger = new Hamburger();
    }

    public abstract void addBread(Ingredient bread);

    public abstract void addMeat(Ingredient meat);

    public abstract void addCheese(Ingredient cheese);

    public abstract void addSauce(Ingredient sauce);

    public Hamburger build(){
        Hamburger result = this.burger;
        this.reset();

        return result;
    }
}
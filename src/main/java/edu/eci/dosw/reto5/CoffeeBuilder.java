package eci.dosw.reto5;

public class CoffeeBuilder {
    private Coffee coffee;
    //Constructor method
    public CoffeeBuilder(){
        this.coffee= new Coffee();
    }
    public void withDescription(String description){
        this.coffee.setDescription(description);
    }
    public void addTopping(Topping topping){
        this.coffee.getToppings().add(topping);
    }
    public Coffee build(){
        return this.coffee;
    }

}

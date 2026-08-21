package eci.dosw.reto2;

public class Reto2 {
    public static void run(){
        //First we create the ingredients
        Ingredient bread= new Ingredient("brioche", 29);
        Ingredient meat= new Ingredient("beef", 18);
        Ingredient cheese= new Ingredient("american", 9);
        Ingredient sauce= new Ingredient("ketchup", 3);
        //This is the hamburger that we create, we will use cheese, bread and meat, whithout sauce
        StandardHamburgerBuilder builder = new StandardHamburgerBuilder();
        builder.addBread(bread);
        builder.addCheese(cheese);
        builder.addSauce(sauce);
        builder.addMeat(meat);

        Hamburger burger=builder.build();
        for(Ingredient i: burger.getIngredients()){
            System.out.println(i.getname());
        }
    }
}
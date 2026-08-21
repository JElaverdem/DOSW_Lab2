package eci.dosw.reto5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Reto5{
    public static void run() {
          Scanner scanner= new Scanner(System.in);
          List<Coffee> coffees= new ArrayList<>();
          Map<String, Topping> toppings= new HashMap<>();
          Topping milk= new Topping("milk", 1000);
          Topping chocolate= new Topping("chocolate", 1500);
          Topping caramel= new Topping("caramel", 1200);
          Topping whippedCream=new Topping("whipped cream",2000);
          Topping mint= new Topping("mint", 1300);
          Topping strawberrys= new Topping("strawberry", 500);
          toppings.put(milk.getName(), milk);
          toppings.put(chocolate.getName(), chocolate);
          toppings.put(caramel.getName(), caramel);
          toppings.put(whippedCream.getName(), whippedCream);
          toppings.put(mint.getName(), mint);
          toppings.put(strawberrys.getName(), strawberrys);
        while (true) {
            System.out.println("¿Do yo want another coffee? (Y/N)");
            String answer=scanner.nextLine();            
            if(answer.equalsIgnoreCase("n")){
                break;
            }
            CoffeeBuilder cBuilder= new CoffeeBuilder();
            System.out.println("¿Do yo want a description? (Y/N)");
            String wDescription=scanner.nextLine(); 
            if(wDescription.equalsIgnoreCase("y")){
                System.out.println("¿Wich Description?");
                String description=scanner.nextLine(); 
                cBuilder.withDescription(description);
                }
            System.out.println("¿Do yo want topics? (Y/N)");
            String wTopic= scanner.nextLine();
            if(wTopic.equalsIgnoreCase("y")){
                    while(true){
                        System.out.println("¿Wich topic do you want?");
                        String topic= scanner.nextLine();
                        cBuilder.addTopping(toppings.get(topic));
                        System.out.println("Do you want another topic?(Y/N)");
                        String otherTopic= scanner.nextLine();
                        if(otherTopic.equalsIgnoreCase("n")){
                            break;
                        }
                    }
            }
            coffees.add(cBuilder.build());
        }
        double total = coffees.stream()
        .mapToDouble(Coffee::getTotalPrice)
        .sum();
        System.out.println(total);

    }
}
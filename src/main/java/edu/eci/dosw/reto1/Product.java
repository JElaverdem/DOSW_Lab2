package main.java.edu.eci.dosw.reto1;

public class Product {
    private String name;
    private String description;
    private static int globalId = 1;
    private int id;
    private int price;

    public Product (String nameString, String descriptionString, int priceInt){
        this.name = nameString;
        this.description = descriptionString;
        this.price = priceInt;
        this.id = globalId;
        globalId ++; 
    }

    public int getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public int getId(){
        return this.id;
    }
    
}

package main.java.edu.eci.dosw.reto2;

public class Ingredient {
    public String name;
    public double price;
    public Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getname() {
        return name;
    }
    public double getprice() {
        return price;
    }
}
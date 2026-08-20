package eci.dosw.reto8;
import java.util.HashMap;
import java.lang.Math;

public abstract class Animal {
    private String name;
    private int age;
    private String diet;
    private String preferredFood;
    private double weight;
    private double height;
    private HealthStatus healthStatus;
    private HashMap<String, String> dynamimcAttributes;

    public Animal (String newName, int newAge, String newDiet, String newPreferredFood, double newWeight, double newHeight, HealthStatus newHealth){
        this.name = newName;
        this.age = newAge;
        this.diet = newDiet;
        this.preferredFood = newPreferredFood;
        this.weight = newWeight;
        this.height = newHeight;
        this.healthStatus = newHealth;

        this.dynamimcAttributes = new HashMap<String,String>();
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getDiet(){
        return this.diet;
    }

    public String getPreferredFood(){
        return this.preferredFood;
    }

    public double getWeight(){
        return this.weight;
    }

    public double getHeight(){
        return this.height;
    }

    public HealthStatus getHealthStatus(){
        return this.healthStatus;
    }

    public void setHealthStatus(HealthStatus newHealth){
        this.healthStatus = newHealth;
    }

    public HashMap<String, String> getDynamimcAttributes() {
        return this.dynamimcAttributes;
    }

    public void addDynamicAttribute(String name, String attribute){
        this.dynamimcAttributes.put(name, attribute);
    }

    public void eat(){
        this.weight += Math.random() * 5;
    }
    public abstract String makeSound();
}

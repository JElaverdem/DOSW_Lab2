package eci.dosw.reto8;

public class Mammal extends Animal{
    public Mammal (String newName, int newAge, String newDiet, String newPreferredFood, double newWeight, double newHeight, HealthStatus newHealth){
        super(newName, newAge, newDiet, newPreferredFood, newWeight, newHeight, newHealth);
    }

    public String makeSound(){
        return "grrrr";
    }
}

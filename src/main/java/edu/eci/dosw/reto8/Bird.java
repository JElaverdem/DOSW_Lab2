package eci.dosw.reto8;

public class Bird extends Animal{
    public Bird(String newName, int newAge, String newDiet, String newPreferredFood, double newWeight, double newHeight, HealthStatus newHealth){
        super (newName, newAge, newDiet, newPreferredFood, newWeight, newHeight, newHealth);
    }

    public String makeSound(){
        return "Tweet tweet";
    }
}

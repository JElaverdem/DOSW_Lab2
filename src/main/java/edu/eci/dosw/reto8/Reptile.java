package eci.dosw.reto8;

public class Reptile extends Animal{
    public Reptile (String newName, int newAge, String newDiet, String newPreferredFood, double newWeight, double newHeight, HealthStatus newHealth){
        super(newName, newAge, newDiet, newPreferredFood, newWeight, newHeight, newHealth);
    }

    public String makeSound(){
        return "hissss";
    }
}

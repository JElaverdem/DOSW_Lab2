package main.java.edu.eci.dosw.reto8;

import java.util.ArrayList;

public class Caretaker {
    private String name;
    private int age;
    private String specialty;
    private ArrayList<Animal> assignedAnimals;
    public Caretaker(String name, int age, String specialty){
        this.name=name;
        this.age=age;
        this.specialty=specialty;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getSpecialty(){
        return this.specialty;
    }
    public void assignAnimal(Animal animal){
        assignedAnimals.add(animal);
    }
    public void feed(Animal animal){
        animal.eat();
    }
    public void bathe(Animal animal ){
        animal.setHealthStatus(HEALTHY);
    }
    public void cleanHabitat(Habitat habitat){
        habitat.clean();
    }
}

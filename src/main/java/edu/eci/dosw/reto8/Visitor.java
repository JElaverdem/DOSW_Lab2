package eci.dosw.reto8;

import java.util.List;

public class Visitor {
    private String name;
    private int age;
    private List<Animal>favoriteAnimals;
    public Visitor(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void selectFavorite(Animal animal){
        favoriteAnimals.add(animal);
    }
    public void feedAnimal(Animal animal){
        animal.eat();
    }
    public void giveTip(Caretaker caretaker, double Amount){
    }
    public void uploadPhoto(Animal animal){
    }

}

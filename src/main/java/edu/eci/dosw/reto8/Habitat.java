package eci.dosw.reto8;

import java.util.ArrayList;
import java.util.List;

public class Habitat {
    private List<Animal> animals;

    public Habitat() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return this.animals;
    }

    public void clean() {
        System.out.println("that is a habitat |o| wow.");
    }
}
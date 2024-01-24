package com.krishna;

public class Animal implements AnimalI{
    private String name;
    private String breed;

    @Override
    public String makeSound() {
        return "Animal Sound";
    }

    @Override
    public String whatAmI() {
        return "Generic Animal";
    }

    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", breed=" + breed + ", makeSound()=" + makeSound() + ", whatAmI()=" + whatAmI()
                + "]";
    }
}

package com.krishna;

public class Dog extends Animal{
    public Dog(String name, String breed) {
        super(name, breed);
    }

    @Override
    public String makeSound() {
        return "Woof";
    }

    @Override
    public String whatAmI() {
        return "I am a dog";
    }

}

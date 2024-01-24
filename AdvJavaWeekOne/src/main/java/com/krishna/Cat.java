package com.krishna;

public class Cat extends Animal{
    public Cat(String name, String breed) {
        super(name, breed);
    }

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public String whatAmI() {
        return "I am a cat";
    }
}

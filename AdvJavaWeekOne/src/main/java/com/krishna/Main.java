package com.krishna;
/*
 * Student name:Krishna Sharama
 * Course and section: INEW-2338-22700, INEW-2038-22700
 * Assignment: Week-1
 * This is week one assignment that works with inheritance and Recursion. Dog and Cat inherit Animal
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().go();
    }

    private void go(){
        ArrayList<Animal> animals = new ArrayList<>();
        String filePath = "./animal.txt";

        try(Scanner scanner = new Scanner(new File(filePath))){
            while(scanner.hasNextLine()){
                String[] tokens = scanner.nextLine().split(",");
                String type = tokens[0];
                String name = tokens[1];
                String breed = tokens[2];

                switch(type){
                    case "A":
                        animals.add(new Animal(name, breed));
                        break;

                    case "C":
                        animals.add(new Cat(name, breed));
                        break;

                    case "D":
                        animals.add(new Dog(name, breed));
                        break;
                }
            }

            //Iterate through the ArrayList and print each animal
            for (Animal animal: animals){
                System.out.println(animal);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

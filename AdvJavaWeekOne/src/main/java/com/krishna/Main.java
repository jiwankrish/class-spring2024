package com.krishna;

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

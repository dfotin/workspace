package com.edu.ocp.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectIO {

    public static void createAnimalsFile(List<Animal> animals, File dataFile) throws IOException {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(dataFile))) {
            for (Animal animal : animals) {
                os.writeObject(animal);
            }
        }
    }

    public static List<Animal> getAnimals(File sourceFile) throws IOException, ClassNotFoundException {
        List<Animal> animals = new ArrayList<>();
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(sourceFile))) {
            while (true) {
                Object obj = is.readObject();
                if (obj instanceof Animal)
                    animals.add((Animal) obj);
            }
        } catch (EOFException e) {
            // do nothing, just to terminate while and realize that file end reached
        }
        return animals;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Animal dog = new Animal("Polkan", 2);
        Animal cat = new Animal("Sasha", 8);
        List<Animal> animals = Arrays.asList(dog, cat);
        File dataFile = new File("src/main/resources/Animals.txt");

        createAnimalsFile(animals, dataFile);

        List<Animal> resultAnimals = getAnimals(dataFile);
        System.out.println(resultAnimals);
    }
}

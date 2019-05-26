package com.edu.ocp.io;

import java.io.*;
import java.util.stream.Stream;

public class CopyFileCharacter {
    public static void copyFile(File source, File destination) throws IOException {
        try (Reader reader = new FileReader(source); Writer writer = new FileWriter(destination)) {
            int b;
            while ((b = reader.read()) != -1) {
                writer.write(b);
            }
        }
    }

    public static void copyFileBuffer(File source, File destination) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(source));
             PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(destination)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File source = new File("src/main/resources/Zoo.txt");
        File destination = new File("src/main/resources/Zoo_Copy2.txt");

        copyFile(source, destination);

        File destination1 = new File("src/main/resources/Zoo_Copy3.txt");

        copyFileBuffer(source, destination1);
        Integer[] d = null;
    }
}

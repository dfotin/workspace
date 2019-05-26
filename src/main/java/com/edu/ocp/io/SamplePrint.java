package com.edu.ocp.io;

import java.io.*;

public class SamplePrint {

    public static void main(String[] args) {
        try (PrintStream printStream = new PrintStream(new FileOutputStream("src/main/resources/SamplePrint.txt"));
             FileWriter fileWriter = new FileWriter("src/main/resources/SamplePrint.txt");
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            printStream.println("Hello World!");

            //printWriter.format("Hello Word, again!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

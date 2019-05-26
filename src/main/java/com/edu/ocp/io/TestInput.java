package com.edu.ocp.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInput {

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Please enter your name ...");
            String name = bufferedReader.readLine();
            System.out.println("Your age ...");
            String age = bufferedReader.readLine();
            System.out.println("So, you are " + name + ", " + age + " years old");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

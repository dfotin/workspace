package com.edu.ocp.io;

import java.io.*;

public class CopyFileStream {

    public static void copyFile(File source, File destination) throws IOException {
        try (InputStream is = new FileInputStream(source); OutputStream os = new FileOutputStream(destination)) {
            int currentByte = 0;
            while ((currentByte = is.read()) != -1) {
                os.write(currentByte);
            }
        }
    }

    public static void copyFileBuffer(File source, File destination) throws IOException {
        try (InputStream is = new BufferedInputStream(new FileInputStream(source));
             OutputStream os = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[128];
            int lenghtRead = 0;
            while ((lenghtRead = is.read(buffer)) > 0) {
                System.out.println(lenghtRead);
                int offset = lenghtRead - 50;
                os.write(buffer, 50, offset);
                //   os.flush();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File source = new File("src/main/resources/Zoo.txt");
        File destination = new File("src/main/resources/Zoo_Copy.txt");

        copyFile(source, destination);

        File destination1 = new File("src/main/resources/Zoo_Copy1.txt");

        copyFileBuffer(source, destination1);
    }

}

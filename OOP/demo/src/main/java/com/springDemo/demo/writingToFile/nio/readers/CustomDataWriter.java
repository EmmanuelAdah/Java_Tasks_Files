package com.springDemo.demo.writingToFile.nio.readers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomDataWriter {
    public static void main(String[] args) {
        try {
            String data = "Mr. Fems writing to file using Java";
            String directoryPath = "C:\\Users\\DELL\\";
            String fileName = "data.txt";
            Path path = Paths.get(directoryPath, fileName);

            if (!Files.exists(path)) {
                createFile(directoryPath, fileName);
            } else {
                System.out.println("File already exists");
            }

            System.out.println(path);
            Files.write(path, data.getBytes());

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void createFile(String directoryPath, String fileName) {
        try{
            Path path = Paths.get(directoryPath, fileName);
            Files.createFile(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

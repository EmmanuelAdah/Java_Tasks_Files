package com.springDemo.demo.writingToFile.io.readers.characters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomBufferedReader {
    public static void main(String[] args) {

        try(var inputStreamReader = new InputStreamReader(System.in)){
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();

            System.out.println(line);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

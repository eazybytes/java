package com.eazybytes.input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWithBFR {

    public static void main(String[] args) throws  IOException {
        FileReader fileReader = new FileReader("/Users/eazybytes/Desktop/story.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        String line;

        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }

}

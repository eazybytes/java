package com.eazybytes.java22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UnnamedVariables {

    public static void main(String[] args) {
        // Scenario 1
        List<String> wordList = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        int totalWords = countWords(wordList);
        System.out.println(totalWords);

        // Scenario 2
        List<String> fruits = Arrays.asList("apple", "banana", "orange");
        Map<String, String> fruitMap = fruits.stream()
                .collect(Collectors.toMap(f -> f, _ -> "Fruit"));
        System.out.println(fruitMap);

        // Scenario 3
        boolean isValid = convertAndDisplay("45");

        // Scenario 4
        executeIfFilePresent();

        // Scenario 5
        Point point = new Point(7, 3);
        if (point instanceof Point(int x, _)) {
            // Only use the 'x' property from the Point record
            System.out.printf("Point object with value of x: %d%n", x);
        }
    }

    public static int countWords(Iterable<String> words) {
        int totalWords = 0;
        for (String _ : words) {
            totalWords++;
        }
        return totalWords;
    }

    public static boolean convertAndDisplay(String input) {
        boolean isValid;
        try{
            int _ = Integer.parseInt(input);
            isValid = true;
        }catch (NumberFormatException _) {
            System.out.println("NumberFormatException due to invalid input: " + input);
            isValid = false;
        }catch (Exception _) {
            System.out.println("Exception due to invalid input: " + input);
            isValid = false;
        }
        return isValid;
    }

    public static void executeIfFilePresent() {
        String filePath = "example.txt";
        try(BufferedReader _ = new BufferedReader(new FileReader(filePath));){
            System.out.println("Executing some logic");
        } catch (FileNotFoundException _) {
            System.out.println("FileNotFoundException");
        } catch (IOException _) {
            System.out.println("IOException");
        }
    }

}

record Point(int x, int y) { }


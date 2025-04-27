package com.eazybytes.java23;


import module java.base;

public class ImportModule {

    public static void main(String[] args) {
        try {
            // Reading the file line by line
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            Map<Integer, String> lineMap = new HashMap<>();

            String line;
            int lineNumber = 1;

            // Storing each line in a map with its line number
            while ((line = reader.readLine()) != null) {
                lineMap.put(lineNumber, line.trim());
                lineNumber++;
            }

            // Print out the map for demonstration
            for (Map.Entry<Integer, String> entry : lineMap.entrySet()) {
                System.out.println("Line " + entry.getKey() + ": " + entry.getValue());
            }

            reader.close();
        } catch (IOException e) {
            throw new RuntimeException("File reading error: " + e.getMessage());
        }
    }

}

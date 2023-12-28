package com.eazybytes.log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingDemo {

    private static Logger logger = Logger.getLogger(LoggingDemo.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.SEVERE);
        logger.info("This is info level logging");
        logger.log(Level.WARNING, "This is warning level logging");
        logger.severe("This is severe level logging");
        System.out.println("Hello using System.out.println");
    }

}

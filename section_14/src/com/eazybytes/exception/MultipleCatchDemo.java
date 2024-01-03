package com.eazybytes.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.logging.Logger;

public class MultipleCatchDemo {

    private static Logger logger = Logger.getLogger(
            MultipleCatchDemo.class.getName());

    public static void main(String[] args) {
        String input = null;
        try {
                input = "Madan";
                input = input.toUpperCase();
                logger.info(input);
                input = input.substring(1,10);
            logger.info(input);
        } catch (NullPointerException ex) {
            logger.severe("An null pointer exception occurred. Please check your data");
        } catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException  ex) {
            logger.severe("IndexOutOfBoundsException exception occurred. Please check your input data");
        } catch (Exception ex) {
            logger.severe("An exception occurred. Please check your program");
        }
    }

}

package com.zipcodewilmington.scientificcalculator;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class CoreFeatures {

    //A state, representing the value currently displayed on the calculator (default 0)
    //Get current number on display
    //Clear display
    //Change number on display
    //Calculate the square (x2) and square root (√x) of the number on the display
    //Create a calculator that can perform addition, subtraction, multiplication, division
    //Calculate variable exponentiation (xy)
    //Calculate the inverse of the number on the display (1/x)
    //Invert the sign of the number on the display (switch between positive and negative)
    //Update the display to Err if an error occurs (eg: Division by zero)
    //Errors must be cleared before any other operation can take place
    //Each operation should automatically update the display

    //clear display; press escape to clear
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    //perform addition, subtraction, multiplication, and division

    //Method formatting:
    public static int example(int x, int y) {
        //Do some logic
        //And return a value
            return x - y;
        }

        //Addition
        public int add(int number1, int number2) {
        return number1 + number2;
    }
        //Subtraction
        public int subtract(int number1, int number2) {
        return number1 - number2;
    }
        //Multiplication
        public int multiply(int number1, int number2) {
        return number1 * number2;
        }

        //Division
        public static int divide(int number1, int number2) {
        return number1 / number2;
        }

    }



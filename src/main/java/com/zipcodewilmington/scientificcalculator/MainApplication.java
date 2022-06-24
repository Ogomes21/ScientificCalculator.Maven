package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
//    public static void main(String[] args) {
//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
//    }

    //Create a calculator that can perform addition, subtraction, multiplication, division.
    //Create four different methods. Each method will take in two variables (numbers)
    //and perform a given operation.

    //Method formatting:
    public static void main(String[] args) {
        example(2,4);
        System.out.println(example(2,4));
    }
    public static int example(int x, int y) {
        //Do some logic
        //And return a value
        return x - y;
    }

    //Subtraction
    public static int subtract(int number1, int number2) {

        return number1 - number2;
    }

    //Addition
    public static int add(int number1, int number2, int number3) {

        return number1 + number2 + number3;
    }

    //Multiplication
    public static int mult(int number1, int number2) {

        return number1 * number2;
    }

    //Division
    public static int div(int number1, int number2) {

        return number1 / number2;
    }

}


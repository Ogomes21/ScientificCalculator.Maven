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

        //object AddFormula
        CoreFeatures AddFormula = new CoreFeatures();
        AddFormula.add(2, 4);
        double ShowAddFormula = AddFormula.add(2, 4);
        String printAddFormula = String.valueOf(ShowAddFormula);
        System.out.println(printAddFormula);

        //object SubtractFormula
        CoreFeatures SubtractFormula = new CoreFeatures();
        SubtractFormula.subtract(10, 5);
        double ShowSubtractFormula = SubtractFormula.subtract(10,5);
        String printSubtractFormula = String.valueOf(ShowSubtractFormula);
        System.out.println(printSubtractFormula);

        //object MultiplyFormula
        CoreFeatures MultiplyFormula = new CoreFeatures();
        MultiplyFormula.multiply(3, 3);
        double ShowMultiplyFormula = MultiplyFormula.multiply(2,3);
        String printMultiplyFormula = String.valueOf(ShowMultiplyFormula);
        System.out.println(printMultiplyFormula);

        //object DivideFormula
        CoreFeatures DivideFormula = new CoreFeatures();
        DivideFormula.divide(8,4);
        double ShowDivideFormula = DivideFormula.divide(8,4);
        String printDivideFormula = String.valueOf(ShowDivideFormula);
        System.out.println(printDivideFormula);
    }

        //example(2,4);
       //System.out.println(example(2,4));

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


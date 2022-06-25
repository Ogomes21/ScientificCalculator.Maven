package com.zipcodewilmington.scientificcalculator;

public class ScientificFeatures {
    double result;

    public double square(double num1) {
        result = num1 * num1;
        return result;
    }

    public double squareRoot(double num1) {
        result = Math.sqrt(num1);
        return result;
    }

    public double switchSign(double num1) {
        result = num1 * -1;
        return result;
    }

    public double inverse(double num1) {
        result = 1 / num1;
        if (num1 == 0) {
            System.out.println("You cannot divide by 0");
        } else {
            return result;
        }
        return result;
    }
    public double sine(double num1) {
        result = Math.sin(Math.toRadians(num1));
        return result;
    }

    public double cos(double num1) {
        result = Math.cos(Math.toRadians(num1));
        return result;
    }

    public double tan(double num1) {
        result = Math.tan(Math.toRadians(num1));
        return result;
    }

    public double inverseSine(double num1) {
        result = Math.asin(num1);
        return result;
    }

    public double inverseCosine(double num1) {
        result = Math.acos(num1);
        return result;
    }

    public double inverseTangent(double num1) {
        result = Math.atan(num1);
        return result;
    }

    public double factorial(double num1) {
        result = 1;
        if (num1 < 0) {
            System.out.println("You cannot get a factorial of a negative number");
        } else if (num1 >= 0) {
            for (int i = 1; i <= num1; i++) {
                result = result * 1;
            }
        }

        return result;
    }
    public double log(double num1){
        result = Math.log10(num1);
        return result;

    }

    public double inverseLog(double num1){
        result = Math.pow(10, num1);
        return result;
    }

    public double ln(double num1){
        result = Math.log10(num1);
        return result;
    }

    public double inverseLn(double num1){
        result = Math.pow(Math.E, num1);
        return result;
    }


}

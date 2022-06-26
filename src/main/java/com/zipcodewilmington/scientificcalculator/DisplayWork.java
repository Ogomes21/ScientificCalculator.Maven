package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class DisplayWork {

    private double answer;
    private boolean onButton;
    private double firstNumber;
    private double secondNumber;
    private String switchSignFormulaHolder = "";
    private String switchSignFormulaHolderNegSecond = "";
    private boolean wrongOperator;


    public void calcRun() {

        onButton = true;
        String operator;
        Scanner Calculator = new Scanner(System.in);
        ScientificFeatures switchSignFormula = new ScientificFeatures();
        Scanner inputEsc = new Scanner(System.in);
        CoreFeatures clear = new CoreFeatures();


        while (onButton != false) {
            wrongOperator = true;
            System.out.println("For addition, subtraction, division, or multiplication please enter one of these as operator: + - / * ");
            System.out.println("For the square, square-root, switch sign or fac, please enter one of these as the operator **(square) */ (squareRoot) +/-(switch sign) fac (factorial)");
            System.out.println("For the inverse, sine, cosine, tan, invsine, incosine or invtangent, please type one of the respective operators.");

            System.out.println();
            System.out.print("Enter first number ");
            firstNumber = Calculator.nextDouble();
            if(!Calculator.hasNextDouble()) {
                    System.out.println("Incorrect operator");
                    do {
                        System.out.println("Do you want to exit? \nPlease enter Y or press N to clear the display");
                        String inputEscRead = inputEsc.next();
                        if (inputEscRead.equalsIgnoreCase("Y")) {
                            onButton = false;
                        } else if (inputEscRead.equalsIgnoreCase("N")) {
                            DisplayWork reRun = new DisplayWork();
                            clear.clear();
                            reRun.calcRun();
                        } else {
                            System.out.println("Please enter the correct letter");
                        }
                        break;
                    } while (!wrongOperator);
            }

            System.out.print("Enter math operator to use for this calculation ");
            operator = Calculator.next();
            if (!operator.equals("+/-") || !operator.equals("+") || !operator.equals("-") || !operator.equals("/") || !operator.equals("*/") ||
                    !operator.equals("*") || !operator.equals("**") || !operator.equals("fac") || !operator.equals("sine") || !operator.equals("cosine") ||
                    !operator.equals("tan") || !operator.equals("invsine") || !operator.equals("incosine") || !operator.equals("invtangent")) {
                System.out.println("Incorrect operator");
                do {
                    System.out.println("Do you want to exit? \nPlease enter Y or press N to clear the display");
                    String inputEscRead = inputEsc.next();
                    if (inputEscRead.equalsIgnoreCase("Y")) {
                        onButton = false;
                    } else if (inputEscRead.equalsIgnoreCase("N")) {
                        DisplayWork reRun = new DisplayWork();
                        clear.clear();
                        reRun.calcRun();
                    } else {
                        System.out.println("Please enter the correct letter");
                    }
                    break;
                } while (!wrongOperator);

                if (operator.equalsIgnoreCase("+/-")) {
                    String switchSignFomrulaRead = String.valueOf((int) switchSignFormula.switchSign(firstNumber));
                    switchSignFormulaHolder = switchSignFomrulaRead;
                    System.out.print("Enter second number ");
                    secondNumber = Calculator.nextDouble();
                    if(secondNumber!= answer) {
                        System.out.println("Incorrect operator");
                        do {
                            System.out.println("Do you want to exit? \nPlease enter Y or press N to clear the display");
                            String inputEscRead = inputEsc.next();
                            if (inputEscRead.equalsIgnoreCase("Y")) {
                                onButton = false;
                            } else if (inputEscRead.equalsIgnoreCase("N")) {
                                DisplayWork reRun = new DisplayWork();
                                clear.clear();
                                reRun.calcRun();
                            } else {
                                System.out.println("Please enter the correct letter");
                            }
                            break;
                        } while (!wrongOperator);
                    }
                    System.out.println("Enter math operator to use for this calculation (if another negative number, please enter +/- again)");
                    operator = Calculator.next();
                    if (!operator.equals("+/-") || !operator.equals("+") || !operator.equals("-") || !operator.equals("/") || !operator.equals("*/") ||
                            !operator.equals("*") || !operator.equals("**") || !operator.equals("fac") || !operator.equals("sine") || !operator.equals("cosine") ||
                            !operator.equals("tan") || !operator.equals("invsine") || !operator.equals("incosine") || !operator.equals("invtangent")) {
                        System.out.println("Incorrect operator");
                        do {
                            System.out.println("Do you want to exit? \nPlease enter Y or press N to clear the display");
                            String inputEscRead = inputEsc.next();
                            if (inputEscRead.equalsIgnoreCase("Y")) {
                                onButton = false;
                            } else if (inputEscRead.equalsIgnoreCase("N")) {
                                clear.clear();
                            } else {
                                System.out.println("Please enter the correct letter");
                            }
                            break;
                        } while (!wrongOperator);
                    }

                    if (operator.equalsIgnoreCase("+/-")) {
                        String switchSignFormulaReadSecond = String.valueOf((int) switchSignFormula.switchSign((secondNumber)));
                        switchSignFormulaHolderNegSecond = switchSignFormulaReadSecond;
                        System.out.println("Enter math operator to use for this calculation");
                        operator = Calculator.next();
                        if (operator.equalsIgnoreCase("+")) {
                            CoreFeatures additionFormula = new CoreFeatures();
                            String additionFormulaRead = String.valueOf((int) additionFormula.add(Double.parseDouble(switchSignFormulaHolder), Double.parseDouble(switchSignFormulaHolderNegSecond)));
                            System.out.println(additionFormulaRead);
                            System.out.println("Do you want to exit? \n Please enter Y or press N to clear the display");
                            String inputEscRead = inputEsc.next();
                            if (inputEscRead.equalsIgnoreCase("Y")) {
                                onButton = false;
                            } else if (inputEscRead.equalsIgnoreCase("N")) {
                                System.out.println("\033[H\033[2J");
                                System.out.flush();
                            } else {
                                System.out.println("Please enter the correct letter");
                            }

                        } else if (operator.equalsIgnoreCase("-")) {
                            CoreFeatures subtractionFormula = new CoreFeatures();
                            String subtractionFormulaRead = String.valueOf((int) subtractionFormula.subtract(Double.parseDouble(switchSignFormulaHolder), Double.parseDouble(switchSignFormulaHolderNegSecond)));
                            System.out.println(subtractionFormulaRead);
                            System.out.println("Do you want to exit? \n Please enter Y or press N to clear the display");
                            String inputEscRead = inputEsc.next();
                            if (inputEscRead.equalsIgnoreCase("Y")) {
                                onButton = false;
                            } else if (inputEscRead.equalsIgnoreCase("N")) {
                                clear.clear();
                            } else {
                                System.out.println("Please enter the correct letter");
                            }
                        }
                    }
                } else {
                    System.out.println("Enter math operator to use for this calculation");
                    operator = Calculator.next();
                    System.out.print("Enter second number ");
                    secondNumber = Calculator.nextDouble();
                }


//            String switchSignFormulaRead = String.valueOf(switchSignFormula.switchSign(firstNumber));
//            System.out.println(switchSignFormulaRead);


                switch (operator) {
                    case "+":
                        CoreFeatures additionFormula = new CoreFeatures();
                        String additionFormulaRead = String.valueOf((int) additionFormula.add(firstNumber, secondNumber));
                        System.out.println(additionFormulaRead);
                        break;
                    case "-":
                        CoreFeatures subtractionFormula = new CoreFeatures();
                        String subtractionFormulaRead = String.valueOf((int) subtractionFormula.subtract(firstNumber, secondNumber));
                        System.out.println(subtractionFormulaRead);
                        break;
                    case "/":
                        CoreFeatures divisionFormula = new CoreFeatures();
                        String divisionFormulaRead = String.valueOf((int) divisionFormula.div(firstNumber, secondNumber));
                        System.out.println(divisionFormulaRead);
                        break;
                    case "*":
                        CoreFeatures multiplyFormula = new CoreFeatures();
                        String multiplyFormulaRead = String.valueOf((int) multiplyFormula.mult(firstNumber, secondNumber));
                        System.out.println(multiplyFormulaRead);
                        break;
                    case "**":
                        ScientificFeatures squareFormula = new ScientificFeatures();
                        String squareFormulaPrint = String.valueOf((int) squareFormula.square(firstNumber));
                        System.out.println(squareFormulaPrint);
                        break;
                    case "+/-":
                        String switchSignFomrulaRead = String.valueOf((int) switchSignFormula.switchSign(firstNumber));
                        System.out.println(switchSignFomrulaRead);
                        break;
                    case "*/":
                        ScientificFeatures squareRootFormula = new ScientificFeatures();
                        String squareRootFormulaPrint = String.valueOf(squareRootFormula.squareRoot(firstNumber));
                        System.out.println(squareRootFormulaPrint);
                        break;
                    case "inverse":
                        ScientificFeatures inverseFormula = new ScientificFeatures();
                        String inverseFormulaRead = String.valueOf(inverseFormula.inverse(firstNumber));
                        System.out.println(inverseFormulaRead);
                        break;
                    case "sine":
                        ScientificFeatures sineFormula = new ScientificFeatures();
                        String sineFormulaRead = String.valueOf(sineFormula.sine(firstNumber));
                        System.out.println(sineFormulaRead);
                        break;
                    case "cos":
                        ScientificFeatures cosineFormula = new ScientificFeatures();
                        String cosineFormulaRead = String.valueOf(cosineFormula.cos(firstNumber));
                        System.out.println(cosineFormulaRead);
                        break;
                    case "tan":
                        ScientificFeatures tanFormula = new ScientificFeatures();
                        String tanFormulaRead = String.valueOf(tanFormula.tan(firstNumber));
                        System.out.println(tanFormulaRead);
                        break;
                    case "invsine":
                        ScientificFeatures arcSine = new ScientificFeatures();
                        String arcSineRead = String.valueOf(arcSine.inverseSine(firstNumber, secondNumber));
                        System.out.println(arcSineRead);
                        break;
                    case "invcosine":
                        ScientificFeatures arcCosine = new ScientificFeatures();
                        String arcCosineRead = String.valueOf(arcCosine.inverseCosine(firstNumber, secondNumber));
                        System.out.println(arcCosineRead);
                        break;
                    case "invtangent":
                        ScientificFeatures arcTan = new ScientificFeatures();
                        String arcTanFormula = String.valueOf(arcTan.inverseTangent(firstNumber, secondNumber));
                        System.out.println(arcTanFormula);
                        break;
                    case "fac":
                        ScientificFeatures factorialFormula = new ScientificFeatures();
                        String factorialFormulaRead = String.valueOf(factorialFormula.factorial(firstNumber));
                        System.out.println(factorialFormulaRead);
                        break;
                    default:
                        System.out.println("Incorrect operator");
                        do {
                            System.out.println("Do you want to exit? \nPlease enter Y or press N to clear the display");
                            String inputEscRead = inputEsc.next();
                            if (inputEscRead.equalsIgnoreCase("Y")) {
                                onButton = false;
                            } else if (inputEscRead.equalsIgnoreCase("N")) {
                                clear.clear();
                                wrongOperator = false;
                            } else {
                                System.out.println("Please enter the correct letter");
                            }
                            break;
                        } while (!wrongOperator);
                }
                System.out.println("Do you want to exit? \n Please enter Y or press N to clear the display");
                String inputEscRead = inputEsc.next();
                if (inputEscRead.equalsIgnoreCase("Y")) {
                    onButton = false;
                } else if (inputEscRead.equalsIgnoreCase("N")) {
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                } else {
                    System.out.println("Please enter the correct letter");
                }
            }

        }

    }
}


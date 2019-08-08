package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int argOne;
    private int argTwo;
    private String action;


    public void parseExpression(String mathExpression) {
        String[] expression = mathExpression.split(" ");
        argOne = Integer.parseInt(expression[0]);
        argTwo = Integer.parseInt(expression[2]);
        action = expression[1];
    }

    public String calculate() {
        switch (action) {
            case "+":
                return argOne + " " + action + " " + argTwo + " = " + (argOne + argTwo);
            case "-":
                return argOne + " " + action + " " + argTwo + " = " + (argOne - argTwo);
            case "*":
                return argOne + " " + action + " " + argTwo + " = " + (argOne * argTwo);
            case "/":
                return argOne + " " + action + " " + argTwo + " = " + (argOne / argTwo);
            case "^":
                return argOne + " " + action + " " + argTwo + " = " + (int)Math.pow(argOne, argTwo);
            case "%":
                return argOne + " " + action + " " + argTwo + " = " + (argOne % argTwo);
            default: return null;
        }
    }
}

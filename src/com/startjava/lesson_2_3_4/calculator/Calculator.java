package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int argOne;
    private int argTwo;
    private String action;

    public String calculate(String line) {
        String[] arr = line.split(" ");
        argOne = Integer.parseInt(arr[0]);
        argTwo = Integer.parseInt(arr[2]);
        action = arr[1];

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

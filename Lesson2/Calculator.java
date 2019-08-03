public class Calculator {
    private int argOne = 10;
    private int argTwo = 0;
    private String action;

    public void setArgOne(int argOne) {
        this.argOne = argOne;
    }

    public void setArgTwo(int argTwo) {
        this.argTwo = argTwo;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String operation() {
        switch (action) {
            case "+": return argOne + " " + action + " " + argTwo + " = " + (argOne + argTwo);
            case "-": return argOne + " " + action + " " + argTwo + " = " + (argOne - argTwo);
            case "*": return argOne + " " + action + " " + argTwo + " = " + (argOne * argTwo);
            case "/": return argOne + " " + action + " " + argTwo + " = " + (argOne / argTwo);
            case "^": return argOne + " " + action + " " + argTwo + " = " + (Math.pow(argOne, argTwo));
            case "%": return argOne + " " + action + " " + argTwo + " = " + (argOne % argTwo);
        }
        return null;
    }
}

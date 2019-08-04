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
            case "^": {
                int result = 1;
                for (int i = 1; i <= argTwo; i++) {
                    result *= argOne;
                }
                return argOne + " " + action + " " + argTwo + " = " + result;
            }
            case "%":
                return argOne + " " + action + " " + argTwo + " = " + (argOne % argTwo);
            default: return null;
        }
    }
}

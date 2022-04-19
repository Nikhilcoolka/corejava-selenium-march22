package org.matrix.lambda.akashgupta.javaconcepts.corejava.classes;

public class ArithmeticOperation {
    public int add(int a, int b) {
        return a + b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int div(int dividend, int divisor) {
        return dividend / divisor;
    }

    public int mod(int a, int b) {
        return a % b;
    }

    public float addF(float a, float b) {
        return a + b;
    }

    public float mulF(float a, float b) {
        return a * b;
    }

    public float subF(float a, float b) {
        return a - b;
    }


    public float divF(float dividend, float divisor) {
        return dividend / divisor;
    }

    public void operateAll(int a, int b) {
        System.out.println("use case of this. operator refer code.........");
        System.out.println("Addition " + a + "+" + b + " = " + this.add(a, b));
        System.out.println("Subtraction " + a + "-" + b + " = " + this.sub(a, b));
        System.out.println("Multiplication " + a + "*" + b + " = " + this.mul(a, b));
        System.out.println("Division " + a + "/" + b + " = " + this.div(a, b));
        System.out.println("Remainder " + a + "/" + b + " = " + this.mod(a, b));
    }

    public int arithSwitchCase(String operation, int a, int b) {//operation- insert @NotNull
        int result = 0;
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "%":
                return a % b;
            default:
                System.out.println("Provide operation In symbolic form in double quote ..........");
        }

        return result;
    }
}

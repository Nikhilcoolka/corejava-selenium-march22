package org.matrix.lambda.akashgupta.javaconcepts.corejava.methods;

public class MethodArgumentPassing {
    public int add(int a, int b) {
        return a + b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public void operateAll(int a, int b) {
        System.out.println("use case of this. operator refer code.........");
        System.out.println("Addition " + a + "+" + b + " = " + this.add(a, b));
        System.out.println("Subtraction " + a + "-" + b + " = " + this.sub(a, b));
        System.out.println("Multiplication " + a + "*" + b + " = " + this.mul(a, b));
        System.out.println("Divition " + a + "/" + b + " = " + this.div(a, b));
    }

    public int arithMOperation(String operation, int a, int b) {//operation- insert @NotNull
        int result = 0;
        switch (operation) {
            case "ADD":
                result = a + b;
                return result;
            case "SUB":
                result = a - b;
                break;
            case "MUL":
                result = a * b;
                break;
            case "DIV":
                result = a / b;
                break;
            default:
                this.dispMessage();
        }

        return result;     //why to take separate variable
    }

    public static void main(String[] args) {
        MethodArgumentPassing obj = new MethodArgumentPassing();
        System.out.println("Call and pass by object..............");
        System.out.println("Addition : " + obj.arithMOperation("ADD", 10, 2));
        System.out.println(obj.arithMOperation("SUB", 20, 10));
        System.out.println(obj.arithMOperation("DIV", 20, 10));
        System.out.println(obj.arithMOperation("MUL", 2, 10));
        //System.out.println(this.arithMOperation("ADD",10,2));//this. operator cannot be called in static method
        System.out.println(obj.arithMOperation("xyz", 2, 10));
        obj.operateAll(10, 20);


    }

    public void dispMessage() {
        System.out.println("Provide operation In ADD/MUL/SUB/DIV ..........");
        System.out.println("you have called this method by this. operator\n" +
                "you can use this. only in non static method");
    }


}

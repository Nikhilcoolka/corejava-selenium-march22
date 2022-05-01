package org.matrix.alpha.shamal;

public class StaticMethodExamples {

    int rollNo = 21;
    int prnNo = 123321;
    String name = "Shamal Jadhav";
    String className = "BE-Comp";
    static String clgName = "SVCET";
    /*Static method declaration and implimentation*/

    static int cube(int x) {
        return x * x * x;
    }

    public void display() {
        System.out.println("My roll no is :" + rollNo + "\n" + "My PRN No is :" + prnNo + "\n" + "My Name Is " + name + "\n" + "My class is :" + className);
        System.out.println(clgName); // we can directly access Ststic variable here
    }

    public void displayStaticVariable() {
        System.out.println(StaticMethodExamples.clgName); // Static variables called via class name
        System.out.println(StaticMethodExamples.cube(6)); // calling vai class name
    }

    public static void main(String[] args) {
        StaticMethodExamples s = new StaticMethodExamples();
        s.displayStaticVariable();
        s.display();
        int result = StaticMethodExamples.cube(5); // static method calling vai class name
        System.out.println("The cube of number is :" + result);
    }
}







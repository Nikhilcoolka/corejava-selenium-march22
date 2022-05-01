package org.matrix.alpha.kamlesh.mypractice;


public class Kamal2Data {

    public static void Addition(int a, int b) {
        int c = (a + b);
        System.out.println("Total sum = " + c);
    }

    public static void Subtract(int b, int d) {
        int c = (b - d);
        System.out.println("Value is " + c);
    }

    public static void Multiply(int c, int d) {
        int a = (c * d);
        System.out.println("Mutli of " + a);
    }

    public static void main(String[] args) {
        Kamal2Data kam = new Kamal2Data();
        Kamal1Data.display(); // calling static function of Kamal1Data
        Kamal1Data data = new Kamal1Data();
        data.display1(); // calling non-static function by creating object of Kamal!data class
        int a = data.number();
        System.out.println("number is:" + a );
        Addition(Kamal1Data.c, Kamal1Data.b);
        Subtract(Kamal1Data.c, Kamal1Data.e);
        Multiply(Kamal1Data.a, Kamal1Data.b);
    }

}



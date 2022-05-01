package org.matrix.alpha.kamlesh.basics;
    public class ReturnType {
        public int addition(int a, int b, int c) {
            int d = a+b+c;    //These an example of return type
            return d;
        }

        public int subtraction(int a,int b, int c) {
            int d = a-b-c;          //This is an not static method example here I have called subtraction function
            return d;               //through obj name which is Kamal i have created
        }

        public static int Multiply(int a, int b, int c){
            int d = a*b*c;          //This an static exmaple here I have called Multiply function through class name
            return d;               // where you can check
        }
        public String getName(String name) {
            return name;
        }

        public static void main(String[] args) {
            ReturnType Kamal = new ReturnType();
            int addition = Kamal.addition(2,3,5);
            int subtraction = Kamal.subtraction(8,9,9);
            int multiply = ReturnType.Multiply(2,2,2);
            String str = Kamal.getName("Kamal");
            System.out.println(addition);
            System.out.println(subtraction);
            System.out.println(multiply);
            System.out.println("Final return type values");
            System.out.println(str);                    //These one is 2nd example
            System.out.println(Kamal.getName("Kamal")); //These is an example of string non static method here Im printing
        }                                               //"Kamal" in two different types-1st
    }


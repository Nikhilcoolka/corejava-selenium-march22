package org.matrix.delta.prem.javaconcepts.polymorphismConcepts;

public class MethodOverLoading {

        public void m1(int a,int b){

            System.out.println("Addition is = "+ (a+b));
        }

        public void m1(String str, int a){
            System.out.println("name is ="+str+" Age is = "+a);
        }
        public void m1(int a,int b,String c){   //name of method must be same2
            System.out.println(a+b);           //same method name with different parameter4
            System.out.println(c);             //sequence of parameter does matter
        }

        public void m1(String a,int b,int c){     //methods should be in same class1
            System.out.println(a);                //same number parameter but different data type3
            System.out.println("multiplication ="+ b*c);
        }

        public static String m3(String cc){
            System.out.println("i m in Static String method"+cc);
            return cc;
        }

        public static boolean m3(boolean d){
        System.out.println("in static boolean method ="+ d);
        return d;
    }

    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        obj.m1(45,80);
        obj.m1(47,54,"Prem");
        obj.m1("Pandey",4,2);
        obj.m1("prem",26);
        MethodOverLoading.m3(true);
        MethodOverLoading.m3("Alg hi kuch h");
    }
}
     //we can overload main method but when we give other parameter then it will be customised method and
// default main method is mandatory to run the program.
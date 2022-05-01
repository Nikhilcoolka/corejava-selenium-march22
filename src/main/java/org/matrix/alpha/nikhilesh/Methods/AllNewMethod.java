package org.matrix.alpha.nikhilesh.Methods;

public class AllNewMethod {
            public void m1() {
            System.out.println("I am in M1 Method");
        }

        public void m2() {
            System.out.println("I am in M2 Method");
        }

        public void a1() {
            System.out.println("I am in A1 Method");
            a3(); // A3 -is Calling in A1 Method
        }

        public void a2() {
            System.out.println("I am in A2 Method");
            System.out.println("I am Coming From A3 Method call");
        }

        public void a3() {
            System.out.println("I am in A3 Method");
            System.out.println("I am Coming From A1 Method call");
            a2(); // A2 -is Calling in A3 Method
        }

        public static void main(String[] args) {
            AllNewMethod nm=new AllNewMethod();
            nm.m1(); //Method Calling
            nm.m2();//Method Calling
            System.out.println("----------------------------------------------");
            System.out.println("The  New Code is Method Call On Other Methods");
            nm.a1();
        }
    }

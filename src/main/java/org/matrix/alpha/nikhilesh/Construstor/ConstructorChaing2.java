package org.matrix.alpha.nikhilesh.Construstor;

public class ConstructorChaing2 {


    public ConstructorChaing2() {
            this(26); // call 2 nd Constructor
            System.out.println(" I AM IN 1ST CONSTRUCTOR ");

        }
        public ConstructorChaing2(int age) {
            this("Nikhil"); // call 3 rd Constructor
            System.out.println("Aeg "+age);
                        System.out.println(" I AM IN 2 nd CONSTRUCTOR ");
        }

        public ConstructorChaing2(String name) {

            System.out.println("NAme :"+name);

            System.out.println(" I AM IN 3 rd CONSTRUCTOR "); // Return to 1 st Constructor
        }


        public static void main(String[] args) {
            ConstructorChaing2 obj=new ConstructorChaing2();



        }
    }


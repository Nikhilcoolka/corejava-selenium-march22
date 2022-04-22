package org.matrix.alpha.shamal.java.contructor;

public class ContructorCalling {

         int sum;

        // first constructor
        ContructorCalling() {
            // calling the second constructor
            this(5, 2);
        }

        // second constructor
        ContructorCalling(int arg1, int arg2) {
            // add two value
            this.sum = arg1 + arg2;
        }

        void display() {
            System.out.println("Sum is: " + sum);
        }

        // main class
        public static void main(String[] args) {

            // call the first constructor
            ContructorCalling obj = new ContructorCalling();

            // call display method via reference variable
            obj.display();

            new ContructorCalling().display(); // Direct method calling without object
        }

}

package org.matrix.lambda.nisha.methods;

//      concept
//      Local variables has the highest priority than Instance variables
//      if we have same variable names

public class TestMethodsConceptNew {

    // Instance Variables
    int a = 23;
    int b = 34;

    // Local Variables
    public void addition(int a, int b) {
        System.out.println(a+b);
        System.out.println(this.a+this.b);
    }
    // "this" can be used to refer current class instance variable.



}

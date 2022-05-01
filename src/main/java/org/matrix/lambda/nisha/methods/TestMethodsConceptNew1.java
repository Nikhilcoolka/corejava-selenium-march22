package org.matrix.lambda.nisha.methods;

//-------Types of methods---------
// 3. Local variables has the highest priority than Instance variables
//if we have same variable names

import java.lang.System;
import java.lang.String;

public class TestMethodsConceptNew1 {

    // Instance Variables
    int a = 23;
    int b = 34;

    // Local Variables
    public void addition(int a, int b) {
        System.out.println(a + b);
        System.out.println(this.a + this.b);
    }
// "this" can be used to refer current class instance variable.


//-------Types of methods---------
// 4. Sequence of Parameters data type does matter, should be assign value in parameter sequence

    public void addition(float myFloatNum, boolean myBool, char myLetter) {
        System.out.println(myFloatNum);
        System.out.println(myBool);
        System.out.println(myLetter);
    }

    public static void main(String[] args) {
            TestMethodsConceptNew1 add = new TestMethodsConceptNew1();
            add.addition(3, 6);
            add.addition(235.3f, false, 'N');
        }
    }


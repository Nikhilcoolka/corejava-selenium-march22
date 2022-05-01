package org.matrix.lambda.nisha.variables;

public class LocalVariable {

    public static void main(String[] args) {            // main Method
        String ni = "Mobile";                           // LocalVariable
        System.out.println(ni);
    }

    LocalVariable() {                                     // Constructor
        float ff = 4.5F;                                // LocalVariable
        System.out.println(ff);
    }

    {                                                   // Block
        boolean bb = false;                             // LocalVariable
        System.out.println(bb);
    }

    public void test(int i) {                           // int i = LocalVariable
        String str = "Vadisherla";                      // LocalVariable
        System.out.println(str);
        System.out.println(i);
    }

}


/*
--------Local Variables----------

1.The variables which are present inside the methods, constructors or blocks
2.Scope: Scope means where we can access those variables. Scope will be Inside the methods, Blocks or Constructors
3.Memory allocation: When method starts, memory deallocations when method ends
4.Local variables are always needed to initialize (Assign values)
5.Store: Stack memory

 */

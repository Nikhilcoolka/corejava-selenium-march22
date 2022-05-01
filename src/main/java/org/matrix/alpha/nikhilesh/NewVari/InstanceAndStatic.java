package org.matrix.alpha.nikhilesh.NewVari;

import org.matrix.alpha.nikhilesh.Methods.NewMethods;

public class InstanceAndStatic {
    public void show(){
        System.out.println("I am Using Instance Method");

        NewMethods.add(30,40); // Import By Other Class it was called in Directly on Non-Static Method (Class Name:-NewMethods)
    }
    public static void show1(){
        System.out.println("I am using Static Method");

        NewMethods.add(10,20);// Import By Other Class it was called in Directly on Static Method (Class Name:-NewMethods)
    }

    public static void main(String[] args) {
        InstanceAndStatic ins=new InstanceAndStatic();

        ins.show(); // Non-Static Variable Call

        NewMethods.space();//Import By Other Class

        InstanceAndStatic.show1();  // Static Variable Call
    }
}

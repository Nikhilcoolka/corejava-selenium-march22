package org.matrix.alpha.nikhilesh.Demo;

import org.matrix.alpha.nikhilesh.RetrunTypes.TheCall;

public class OtherInstanceVariableCall {
    TheCall the = new TheCall();

    public void dataGet() {
        System.out.println("This is in No Static Variables");
        System.out.println(the.name);
        System.out.println(the.rollNo);
        System.out.println(the.className);
        System.out.println(TheCall.age); // Static Variable Call By Using Class Name
        //System.out.println(the.age); // Static Variable Call By Using Obj Creation (It is Not Recommend)

    }

     public void details(){
         the.getDetails();
     }
   // public void returnTypeClass() {


    public static void main(String[] args) {
        OtherInstanceVariableCall abc = new OtherInstanceVariableCall();
        abc.dataGet();
        System.out.println("The Call Class Instance Variable  is Call On Main Method ");

        TheCall call = new TheCall();

        System.out.println("Name -" + call.name);
        System.out.println("Class -" + call.className);
        System.out.println("Roll No -" + call.rollNo);
        System.out.println(TheCall.age); //Static Instance Variable Call By Using Class Name
        abc.details();
    }
}

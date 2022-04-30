package org.matrix.alpha.nikhilesh.RetrunTypes;

public class TheCall {
   public int rollNo=101;
    public String name="Nikhil";
    public String className="Class-ABC";
    public static int age=25;

    public void getDetails() {
        System.out.println("     This is The-Call CLASS Variables  -");
        System.out.println("ROLL NO:-"+rollNo);
        System.out.println("Name :-"+name);
        System.out.println("CLASS NAME :-"+className);
        System.out.println("AGE :-"+age);
    }

    public static void main(String[] args) {
        TheCall the =new TheCall();
        the.getDetails();
        System.out.println("ROLL NO:-"+the.rollNo); // Non Static Variable Call By Using Obj (the)
        System.out.println("Name :-"+the.name);
        System.out.println("CLASS NAME :-"+the.className);
        System.out.println("AGE :-"+age); //This is Static Variable We Can Call Directly
        System.out.println(TheCall.age); // Static Variable Call By Using Class Name or Call Directly
    }
}

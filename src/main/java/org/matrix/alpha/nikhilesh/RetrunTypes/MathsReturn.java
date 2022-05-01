package org.matrix.alpha.nikhilesh.RetrunTypes;

public class MathsReturn {
    public int Add(int a,int b){
        int c= a+b;
        return c;
    }
    public int Mul(int s,int p){
        int d= s*p;
        return d;
    }
    public static void main(String[] args) {
        MathsReturn mn=new MathsReturn();
        int x=mn.Add(2,5); //Call The ADD Method by-Using Obj Creation & Value Stored in "n"

        int m=mn.Mul(5,5);  // We Can Create OBJ "M" OR Directly We can Use "n" Like

        x= mn.Mul(10,20);  //With-out Create New Obj use "n"  as We Already Created

        System.out.println("Additional :"+x);
        System.out.println("Multiplication :"+m);

        System.out.println(x= mn.Add(10,20)); //Directly We can in Print
        System.out.println(x=mn.Mul(7,5));
    }
}

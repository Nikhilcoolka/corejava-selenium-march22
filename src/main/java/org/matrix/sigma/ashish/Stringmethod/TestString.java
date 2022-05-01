package org.matrix.sigma.ashish.Stringmethod;

public class TestString{

    public void ConcatMethod(){
        String s="Ashish";
        String s1="Thopate";
        String Constr=s.concat(s1);//used add string
        System.out.println(("String Concat Method"));
        System.out.println(Constr);
    }

    public void AppendMethod(){
        System.out.println("StringBuffer Append Method");
        //System.out.println("String Buffer/Builder  is Mutable ");
        StringBuffer st=new StringBuffer("Ashish");
        st.append("Thopate");
        System.out.println(st);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        String str="Ashish";//save in heap and Stack Constant Pool memory
        String str1="Ashish";//save  in Heap and Stack Constant Pool memory

        String str2=new String("Thopate");
        //save in only heap memory
        String str3=new String("Thopate");
        //save in only heap memory

        TestString obj=new TestString();
        obj.ConcatMethod();//String is immutable
        System.out.println("---------------------------------------");
        obj.AppendMethod();
        System.out.println("Compare varaible memory adress----------");

        System.out.println(str==str1);//true
        System.out.println("it shows True because in Stack Constant Pool");
        System.out.println("-----------------------------------------------------------");
        System.out.println(str2==str3);//false


        System.out.println("it shows False because in Heap Memory ");

        System.out.println("------------------------------------------");

        System.out.println(str.equals(str1));//true

        System.out.println(str2.equals(str3));//true


    }
}

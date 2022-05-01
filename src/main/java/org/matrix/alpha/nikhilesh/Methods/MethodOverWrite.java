package org.matrix.alpha.nikhilesh.Methods;

public class MethodOverWrite {
      /*  public void m1(){
            System.out.println("I am in M1 Method");
        }
        public void m1() //This is Method Over-Write Or Same Method Name
        {
            System.out.println("I am in M1 Method");
        }
*/
        public void n1(){
            System.out.println("I am in N1 Method");
        }
        public void n2(){
            System.out.println("I am in N2 Method");
        }

    public void q1(String str){
        System.out.println("I am in String Method");
        System.out.println("Name :"+str);
    }
    public void q1(String  str,int age){
        System.out.println("I am in String & Int Method");
        System.out.println("Name :"+str);
        System.out.println("Age :"+age);
        }
    public static void main(String[] args) {
        MethodOverWrite nik=new MethodOverWrite();
        // nik.m1(); // it can not Access why because Their are 2 Same Methods Name ie: m1

        nik.n1();
        nik.n2(); // We Can Access Both N1 & N2 Their are Different Method Name

        nik.q1("Shriniwas"); //  We Can Access Both Q1 & Q2 Their are Same Method Name But Diff Paramters
        nik.q1("Nikhil",25);


    }
}

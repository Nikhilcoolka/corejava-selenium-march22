package org.matrix.sigma.ashish.Polimorphisam;

public class Testoverloading {

    public void add(int a,int b){
        System.out.println(a+b);
    }

    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public void m1(String str){
        System.out.println(str);
        System.out.println("I am in String passing method");
    }

    public void m1(int a){
        System.out.println(a);
        System.out.println("I am in Int passing parameter");
    }

    public void m2(int a,String str){
        System.out.println("integer   "+a);
        System.out.println("String   "+str);
    }

    public void m2(int a,int b){
        System.out.println("integers   "+a);
        System.out.println(b);
    }

    public static void main(String[] args) {

        Testoverloading obj=new Testoverloading();
          obj.add(10,20);
        System.out.println("-----------------------------------------");
        obj.add(30,40,50);
        System.out.println("-----------------------------------------");
        obj.m1(1100);
        System.out.println("------------------------------------------");
        obj.m1("Ashish");
        System.out.println("---------------------------------------------");
        obj.m2(100,200);
        System.out.println("-------------------------------------------");
        obj.m2(300,"Ashish");

    }
}

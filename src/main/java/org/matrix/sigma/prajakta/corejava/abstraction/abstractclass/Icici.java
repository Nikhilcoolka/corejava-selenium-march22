package org.matrix.sigma.prajakta.corejava.abstraction.abstractclass;

public class Icici extends Bank{

    public void saving(){
        System.out.println("I am in saving method..");
    }

    public  void current(){
        System.out.println("I am in current method");
    }

    @Override
    public void cashWithdraw() {
        System.out.println("I am in cashWithdraw method..");
    }

    public static void main(String[] args) {

        //we cannot create object of abstract class
        //Bank ob=new Bank();

        //so we can make reference of abstract class and object of Icici class
        Bank obj=new Icici();
        obj.saving();
        obj.current();
        /*
         so here Icici class object is created and it will call the default constructor of class and in default
         constructor compiler will automatically call parent class i.e Bank default constructor.
         so abstract class constructor will call.
         */
    }
}

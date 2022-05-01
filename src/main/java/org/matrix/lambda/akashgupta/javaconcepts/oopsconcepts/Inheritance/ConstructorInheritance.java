package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.Inheritance;

import org.matrix.lambda.akashgupta.javaconcepts.corejava.methods.ConstructorTypes;

public class ConstructorInheritance extends ConstructorTypes {
    int num;
    String name;
    static String companyName;

    ConstructorInheritance(){
        System.out.println("This is local (Package-Private) constructor");
        super.display();
        System.out.println("As parent constructor is invoked by default by invoking child's constructor ");
    }

    public ConstructorInheritance(int num,String name,String companyName){

        super.num=num;
        super.name=name;

        this.num=num;
        this.name=name;

        ConstructorInheritance.companyName=companyName;
        ConstructorTypes.companyName=companyName;
        System.out.println("This is local (public) constructor");
        super.display();
    }

    /*void display(){      //
        System.out.println("EmpId : "+this.num);
        System.out.println("EmpName : "+this.name);
        System.out.println("CompanyName : "+companyName);
    }*/

    public void display(){
        System.out.println("this is child");
        System.out.println("EmpId : "+this.num);
        System.out.println("EmpName : "+this.name);
        System.out.println("CompanyName : "+companyName);
    }

    public static void main(String[] args) {
        ConstructorInheritance localObj1= new ConstructorInheritance();
        localObj1.display();
        System.out.println("Using Class inheritance to call public constructor of parent class");
        ConstructorTypes parentObj = new ConstructorTypes(10,"Akash","Microsoft");
        parentObj.display();
        ConstructorInheritance localObj2= new ConstructorInheritance(20,"Rahul","eInfochip");
        System.out.println("Reinitialized parent-Object using local constructor using super keyword");
        parentObj.display();
        localObj2.display();
    }
}
/* .....................................NOTES......................................................
     >>  Cannot create constructor in child if there is no default constructor in parent.
     >>  Parent class default constructor is invoked whenever child class constructor is called.
     >>  Don't initialize parent class instance-variables in child's constructor because scope is-
         instance/local to the following block.
     >>  Always use respective constructor to initialize object of respective class.
     >>  line28-32: error -Override weak access method to public method of parent class
          (resolve by making same access type)
...................................................................................................*/
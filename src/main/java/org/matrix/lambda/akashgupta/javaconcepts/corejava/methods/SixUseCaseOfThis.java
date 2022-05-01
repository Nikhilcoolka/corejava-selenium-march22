package org.matrix.lambda.akashgupta.javaconcepts.corejava.methods;

public class SixUseCaseOfThis {
    int num;
    String name;
    SixUseCaseOfThis(){
        this.display();                               // invoking method
    }
    public void display(){
        System.out.println("Number = "+ this.num);    // passing arguments
        System.out.println("Name = "+ this.name);
    }
    public static void display(SixUseCaseOfThis ref){
        System.out.println("Number = "+ ref.num);    // passing arguments
        System.out.println("Name = "+ ref.name);
    }


    SixUseCaseOfThis(int num){
        this.num=num;                                 // access instance variable
    }
    SixUseCaseOfThis(int num,String name){
        this(num);                                    //access/invoking class constructors (constructor chaining)
        this.name=name;
        display(this);                            // passing as instance of class
    }
    public SixUseCaseOfThis  copyObject(){
        return this;                                  // return as instance of class
    }

    public static void main(String[] args) {
        SixUseCaseOfThis obj1,obj2;
        obj1 = new SixUseCaseOfThis(10,"Akash");
        obj2 = obj1.copyObject();
        obj2.display();
    }

}

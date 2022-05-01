package org.matrix.sigma.akash.method;

public class TestMethod {
    int a = 100;//instance variable
    int b = 200;//instance variable

    public void getData() { //it is non-static method. will be called by using object reference.
        System.out.println("Your are in GetData Method. which is accessed by using object reference.");
        System.out.println("------------------");
        getData2(30, 40);//method chaining process.only access non-static method
    }

    public static void getData1() {//static method.
        System.out.println("You are in GetData1 method. which is static and can called by directly.");
        System.out.println("-------------------------");

    }

    public void getData2(int a, int b) {//it is non-static method with parameter passing.
        int c = a + b;
        System.out.println("You are in GetData2 method which is non static and accessed by parameter passing.");
        System.out.println("Addition is " + c);//local variable accessed as its highest priority
        System.out.println("multiplication of instance variable is ");
        System.out.println(this.a * this.b);//to access instance variable we have to use
        System.out.println("-------------------");
        //"this" keyword
    }

    public int getData3(int a, int b) {//it is return type method by parameter passing.
        int c = a + b;
        System.out.println("Addition is ");
        return c;
    }

    public static void main(String[] args) {
        TestMethod obj = new TestMethod();
        obj.getData();
        TestMethod.getData1();
        obj.getData2(10, 20);
        int add = obj.getData3(50, 40);
        System.out.println(add);
    }
}

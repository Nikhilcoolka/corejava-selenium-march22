package org.matrix.sigma.akash.constructor;

public class TestConstructorChaining {
        public TestConstructorChaining(){
        this(10,1000);//this () call must be first statement in the constructor.
        System.out.println("i am in non args parameter constructor ");
        System.out.println("-------------------------");
    }
    public TestConstructorChaining (int empId){//single param constructor
        System.out.println("I am in Single parameter constructor");
        System.out.println("Employee Id - "+empId);
        System.out.println("-------------------------");
    }
    public TestConstructorChaining (int empId, int salary){
        this(10);
        System.out.println("i am in 2 parameter constructor - ");
        System.out.println("Employee ID - "+empId);
        System.out.println("Salary is -"+salary);
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        TestConstructorChaining obj = new TestConstructorChaining();
    }
}

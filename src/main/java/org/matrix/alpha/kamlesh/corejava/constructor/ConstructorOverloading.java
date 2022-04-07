package org.matrix.alpha.kamlesh.constructor;

public class ConstructorOverloading {
        int rollNo;
        String StuName;
        double Percentage;
    public ConstructorOverloading() {
        System.out.println("Kept for message");
    }
    public ConstructorOverloading(int i,String j) {
        rollNo=i;
        StuName=j;
        System.out.println("Roll no indicates "+i);   /* These is an example of Constructor overloading where I have used
                                                         No args,Single parameter and double parameter and created three
                                                         objects.*/
        System.out.println("Student name is " +j);
    }
    public ConstructorOverloading(double d) {
        Percentage=d;
        System.out.println("Percentage indicates "+d);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(44,"David");
        ConstructorOverloading obj3 = new ConstructorOverloading(96.5);
    }
}

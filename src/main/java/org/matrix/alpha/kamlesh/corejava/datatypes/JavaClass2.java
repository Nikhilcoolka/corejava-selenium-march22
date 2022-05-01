package org.matrix.alpha.kamlesh.datatypes;

public class JavaClass2 {
    public void display() {
        System.out.println("All are functions of JavaClass1");
    }

    public static void main(String[] args) {
        JavaClass2 obj = new JavaClass2();
        JavaClass1 kam = new JavaClass1();
        int sub = kam.Add(1,1);
        double div  = kam.divide(5,2);
        float flo = kam.flo(10,5);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(flo);
        obj.display();
        System.out.println(JavaClass1.myFunction());
    }
}


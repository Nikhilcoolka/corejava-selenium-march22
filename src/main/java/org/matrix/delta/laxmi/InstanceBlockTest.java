package org.matrix.delta.laxmi;

public class InstanceBlockTest {
    {
        System.out.println("This is instance block-executes first when object is created");
    }

    public static void main(String[] args) {
        InstanceBlockTest in = new InstanceBlockTest();
        System.out.println("-----------------------");
        InstanceBlockTest in1 = new InstanceBlockTest();
    }
}

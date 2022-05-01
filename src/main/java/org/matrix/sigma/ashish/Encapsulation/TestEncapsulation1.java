package org.matrix.sigma.ashish.Encapsulation;

public class TestEncapsulation1 {

    public static void main(String[] args) {

        TestAccountEncapsulation obj=new TestAccountEncapsulation();
       obj.setName("Ashish");
        obj.setBalance(1000);

        System.out.println(obj.getName() +"........"+obj.getBalance());
    }
}

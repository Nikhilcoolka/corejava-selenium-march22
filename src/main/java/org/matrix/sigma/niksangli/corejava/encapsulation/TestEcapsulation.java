package org.matrix.sigma.niksangli.corejava.encapsulation;

public class TestEcapsulation  {
    public static void main(String[] args) {
        Account ac=new Account();
        ac.setAccountnumberAlso(30000);  // to input set method
        System.out.println("Account number is" +ac.getAccountnumberAlso());   // to print get method

        ac.setName("Nik");
        System.out.println("Name is"+ac.getName());

    }





}

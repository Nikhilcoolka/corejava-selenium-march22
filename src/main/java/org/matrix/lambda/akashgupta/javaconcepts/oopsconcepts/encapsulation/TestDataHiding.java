package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.encapsulation;

public class TestDataHiding extends AccountDetails {
    public static void main(String[] args) {
        TestDataHiding obj = new TestDataHiding();
        obj.setAccountNo(987754646);
        obj.setPanId("APsjdh3782");
        obj.setBalance(1000);
        obj.setAddress("pune 411051");
        obj.displayDetails();

    }
}

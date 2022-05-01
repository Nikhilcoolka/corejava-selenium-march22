package org.matrix.sigma.ashish.Encapsulation;

public class TestAccountEncapsulation {
    private int balance;
    private String name;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int amount) {
        if (amount < 10000) {
            this.balance = this.balance + amount;
        }
        else {
            throw new RuntimeException("Enter Valid Amount....");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}




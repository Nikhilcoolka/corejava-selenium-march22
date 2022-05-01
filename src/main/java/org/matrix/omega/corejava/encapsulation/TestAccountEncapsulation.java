package org.matrix.omega.corejava.encapsulation;

public class TestAccountEncapsulation {

    private int balance;
    private String name;

    // Getter
    public int getBalance() {
        // User validation
        // Username and password
        // if(username and password == correct)
        return balance;
    }

    public String getName() {
        return name;
    }

    // Setter
    public void setBalance(int amount) {
        // User validation
        // Username and password
        // if(username and password == correct)
        if(amount < 10000) {
            this.balance = this.balance + amount;
        } else {
            throw new RuntimeException("Pleas Enter valid amount..");
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}

package org.matrix.sigma.niksangli.corejava.encapsulation;

public class Account {
    //private data members
    private long accountnumber;
    private String name, email;
    private float amount;

    //public getter and setter methods   DG
    public long getAccountnumberAlso() {
        return accountnumber;
    }

    public void setAccountnumberAlso(long acc_no) {    //VS
        this.accountnumber = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String nm) {
        this.name = nm;
    }
}

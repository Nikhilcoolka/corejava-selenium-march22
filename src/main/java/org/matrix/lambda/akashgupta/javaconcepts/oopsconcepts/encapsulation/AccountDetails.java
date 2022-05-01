package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.encapsulation;

public class AccountDetails {

    private double balance;
    private int accountNo;
    private String panId, address;

    private String maskingData(String s) {
        int end = s.length() - 4;
        char[] mask = new char[end];
        for (int i = 0; i < end; i++) {
            mask[i] = 'x';
        }
        String masked = new String(mask);


        return s.replace(s.substring(0, end), masked);

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNo() {
        String s = accountNo + "";
        return maskingData(s);
    }

    public void setAccountNo(int accountNo) {

        this.accountNo = accountNo;
    }

    public String getPanId() {
        return maskingData(panId);
    }

    public void setPanId(String panId) {
        this.panId = panId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Account No:" + getAccountNo());
        System.out.println("PanId:" + getPanId());
        System.out.println("Account Balance:" + getBalance());
        System.out.println("Address:" + getAddress());
    }
}

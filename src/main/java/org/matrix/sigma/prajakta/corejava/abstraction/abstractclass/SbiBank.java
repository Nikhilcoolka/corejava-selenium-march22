package org.matrix.sigma.prajakta.corejava.abstraction.abstractclass;

public class SbiBank extends Bank{

    @Override
    public void saving() {
        System.out.println("I am in saving method..");
    }

    @Override
    public void current() {
        System.out.println("I am in current method");
    }

    @Override
    public void cashWithdraw() {
        System.out.println("I am in cashwithdraw method");
    }

    public static void main(String[] args) {
        Bank obj=new SbiBank();
        obj.saving();
        obj.current();
        obj.cashWithdraw();
    }
}

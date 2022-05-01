package org.matrix.sigma.ashish.Method;

public class PassParameter {
    public static void main(String[] args) {
        PassParameter pp = new PassParameter();
        pp.getData("Ashish", 20, "Nira");
    }

    public void getData(String str, int age, String str1) {
        System.out.println(str);
        System.out.println(age);
        System.out.println(str1);
    }
}

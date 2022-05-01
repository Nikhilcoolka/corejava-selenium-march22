package org.matrix.alpha.nikhilesh.Methods;

public class NewMethodLog {
    public void get(int a, String b) {
        System.out.println("Age :-" + a);
        System.out.println("Name:-" + b);
    }

    public String data(String str) {
        return str;
    }

    public int data1(int d) {
        return d;
    }
    public static String get(String sd) {
        return sd;
    }

    public void m1() {
        System.out.println("I am in M1 Method");
        m1(25);
        m1("Shruti");
    }

    public void m1(int age) {
        System.out.println("Age -" + age);
    }
    public void m1(String name) {
        System.out.println("Name -" + name);
    }
    public static void main(String[] args) {
        NewMethodLog nm = new NewMethodLog();
        nm.get(20, "Nikhil");

        String ds = nm.data("Harika");

        System.out.println("Name " + ds);

        int s = nm.data1(50);

        System.out.println(s);

        String ds1 = get("Shri");

        System.out.println(ds1);

        nm.m1();

        nm.m1("Radha");// Double String Call Diff Name
    }
}

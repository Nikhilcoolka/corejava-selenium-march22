package org.matrix.sigma.niksangli.method;

public class LoginTestNik {
    public static void main(String[] args) {
        GmailLoginpage l1 = new GmailLoginpage();
        l1.login();
        String s2 = l1.getTitle();
        System.out.println("String is" + s2);
    }
}
package org.matrix.sigma.pankaj.Method;

public class LoginTest {
    public static void main(String[] args) {
        LoginPage LoginPage = new LoginPage();
        LoginPage.login();
       String title = LoginPage.getTitleOfPage();
        System.out.println("Title Of Page: " +title);
    }
}

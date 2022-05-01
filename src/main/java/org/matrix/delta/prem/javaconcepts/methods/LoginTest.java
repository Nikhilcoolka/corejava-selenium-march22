package org.matrix.delta.prem.javaconcepts.methods;

public class LoginTest {

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        String i = loginPage.getTitleOfPage();
        System.out.println("Title of the page is : "+i);
    }
}

package org.matrix.sigma.kadambari.practice;

public class LoginTest {
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        String title = loginPage.getTitleOfPage();
        System.out.println(title);

    }
}

package org.matrix.omega.corejava.methods;

public class LoginTest {

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        String title = loginPage.getTitleOfPage();

        System.out.println("Title of the Page:" + title);
    }
}

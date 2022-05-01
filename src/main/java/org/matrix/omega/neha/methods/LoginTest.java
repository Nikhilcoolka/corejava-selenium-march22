package org.matrix.omega.neha.methods;

public class LoginTest {
    public static void main(String[] args) {
        LoginPage loginpage = new LoginPage();
        loginpage.Login();
        loginpage.getTitleOfPage();
        System.out.println("Title of the page");
    }

}

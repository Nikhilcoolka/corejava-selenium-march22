package org.matrix.alpha.shamal.java.method;

public class LoginPageTest {
    public static void main(String[] args) {
        LoginPageNew loginpage = new LoginPageNew(); // here we access the object of another class

        String title = loginpage.getTitleOfPage();// access the methods of another class

        loginpage.login();

        String loginID = loginpage.getLoginId();

        System.out.println("The Title of the Page Is :" + title);
        System.out.println("Page Login ID is:" + loginID);
    }
}

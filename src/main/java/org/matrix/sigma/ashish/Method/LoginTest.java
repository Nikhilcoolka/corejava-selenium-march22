package org.matrix.sigma.ashish.Method;

public class LoginTest {
    public static void main(String[] args) {
        TestPage obj = new TestPage();
        String str = obj.getTitle();
        obj.login();
        System.out.println("Title of the page=  " + str);
    }
}

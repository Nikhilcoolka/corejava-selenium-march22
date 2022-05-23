package org.matrix.shriniwas.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFirstProgram {
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void signIn() {
        System.out.println("signIn");
    }

    @Test
    public void login() {
        System.out.println("login");
    }

    @Test
    public void logout() {
        System.out.println("logout");
    }
}

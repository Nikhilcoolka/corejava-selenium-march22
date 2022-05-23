package org.matrix.shriniwas.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFirstProgram1 {

    @BeforeClass
    public void beforeClass1() {
        System.out.println("Before Class1");
    }

    @BeforeMethod
    public void beforeMethod1() {
        System.out.println("Before Method1");
    }

    @Test
    public void signIn1() {
        System.out.println("signIn1");
    }

    @Test
    public void login1() {
        System.out.println("login1");
    }

    @Test
    public void logout1() {
        System.out.println("logout1");
    }
}

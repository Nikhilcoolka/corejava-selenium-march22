package org.matrix.sigma.niksangli.testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testprogram1 {
    @Test
    public void logIn1()

    {
        System.out.println("Login1 method");
    }
    @Test
    public void logOut1()

    {
        System.out.println("Logout1 method");
    }

    @Test
    public void signIn1()
    {
        System.out.println("signin1 method");
    }

    @BeforeClass
    public void beforeclass()
    {
        System.out.println("Beforeclass method");
    }

    @AfterClass
    public void Afterclass()
    {
        System.out.println("Afterclass method");
    }

}

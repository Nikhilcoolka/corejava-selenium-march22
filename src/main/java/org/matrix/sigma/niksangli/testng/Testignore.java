package org.matrix.sigma.niksangli.testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Testignore {
    @Test(enabled = false)
    public void logIn2()

    {
        System.out.println("Login2 method");
    }
   @Ignore
    @Test
    public void logOut2()

    {
        System.out.println("Logout2 method");
    }

    @Test
    public void signIn2()
    {
        System.out.println("signin2 method");
    }

    @BeforeClass
    public void beforeclass()
    {
        System.out.println("test ignore Beforeclass method");
    }

    @AfterClass
    public void Afterclass()
    {
        System.out.println("test ignore Afterclass method");
    }

}

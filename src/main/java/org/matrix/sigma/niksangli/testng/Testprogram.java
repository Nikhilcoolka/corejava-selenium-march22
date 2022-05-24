package org.matrix.sigma.niksangli.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testprogram {

    @Test
    public void signin()   //
    {
        System.out.println("sign in method");
    }
    @Test
    public void login()  //
    {
        System.out.println("login method");
    }

    @Test
    public void logout()  //
    {
        System.out.println("log out method");
    }

    @BeforeTest
    public void BeforeTest()
    {
        System.out.println("Before test123");
    }

    @AfterTest
    public void Aftertest()
    {
        System.out.println("After test123");
    }

}

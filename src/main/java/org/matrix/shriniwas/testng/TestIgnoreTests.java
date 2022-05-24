package org.matrix.shriniwas.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class TestIgnoreTests {

    @Ignore
    @Test
    public void signIn() {
        System.out.println("signIn");
    }

    @Ignore
    @Test
    public void login() {
        System.out.println("login");
    }

    @Test(enabled = false)
    public void logout() {
        System.out.println("logout");
    }
}

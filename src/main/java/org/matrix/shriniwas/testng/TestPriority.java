package org.matrix.shriniwas.testng;

import org.testng.annotations.Test;

public class TestPriority {

    // -2, -1 , 0 , +1, +2

    @Test(priority = 1)
    public void b() {
        System.out.println("B method");
    }

    @Test(priority = -2)
    public void c() {
        System.out.println("C method");
    }

    @Test(priority = 1)
    public void a() {
        System.out.println("A method");
    }
}

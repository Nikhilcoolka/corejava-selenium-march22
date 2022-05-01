package org.matrix.shriniwas.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertion {

    @Test
    public void verifyTitleUsingAssertion() {

        // Hard Assert
        Assert.assertEquals("Shriniwas", "Shri");

        // SoftAssert
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals("A", "A");
        softAssert.assertEquals("Shri1", "Shri2");
        softAssert.assertEquals(10, 10);
        softAssert.assertEquals(10, 20);

        softAssert.assertAll();
    }
}

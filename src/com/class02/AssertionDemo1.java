package com.class02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo1 {
    @Test
    public  void assertionVerification(){
        String expectedText="This is my software testing academy";
        String actualText= "This is my SOFTWARE testing academy";

        System.out.println("My expected text is: "+expectedText);
        Assert.assertTrue(false);
       // Assert.assertFalse(false);

        System.out.println("Checking for another assertion");
        Assert.assertEquals(expectedText,actualText);
        System.out.println("My test is working fine and it is passed");

    }

}

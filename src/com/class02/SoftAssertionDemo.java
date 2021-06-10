package com.class02;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
    @Test

    public void softAssertionValidation(){
        String expectedText = "This is my testing world";
        String actualText= "THIS is my testing world";

        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals(expectedText,actualText);
        System.out.println("My code after first assertion");

        softAssert.assertTrue(false);
        System.out.println("My code after second assertion");

        softAssert.assertFalse(true);
        System.out.println("My code after third assertion");

        String secondexpectedText = "This is my testing world";
        String secondactualText= "This is my testing world";
        softAssert.assertEquals(secondactualText,secondexpectedText);
        System.out.println("this is second expected text");
        softAssert.assertAll();
    }
}

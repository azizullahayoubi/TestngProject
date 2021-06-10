package com.class01;

import org.testng.annotations.*;

public class PreAndPostFunctions {
    @BeforeTest
    public void beforeTestMethod(){
        System.out.println("I am before test method");
    }

    @AfterTest
    public void afterTestMethod(){
        System.out.println("I am after test method");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method which will execute before every method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method which will execute after every method");
    }
    @Test
    public void firstMetod(){
        System.out.println("I am first method");

    }
    @Test
    public void method1(){
        System.out.println("I am second test");
    }
}

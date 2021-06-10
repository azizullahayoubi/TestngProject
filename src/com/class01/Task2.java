package com.class01;

import org.testng.annotations.*;

public class Task2 {
    @Test
    public void firstMethod(){
        System.out.println("I am first method");

    }
    @Test
    public void secondMethod(){
        System.out.println("I am second test");
    }

    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public  void AfterMethod(){
        System.out.println("I am After method");
    }
    @BeforeClass
    public  void beforeClass(){
        System.out.println("I am before class");
    }
    @AfterClass
    public  void AfterClass(){
        System.out.println("I am After class");
    }
}

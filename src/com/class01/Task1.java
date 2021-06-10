package com.class01;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1 {
    @Test
    public void firstMethod(){
        System.out.println("I am first method");

    }
    @Test
    public void secondMethod(){
        System.out.println("I am second test");
    }
    @Test
    public void thirdMethod(){
        System.out.println("I am third test");
    }
    @BeforeTest
    public  void beforeTest(){
        System.out.println("I am before test");
    }
    @AfterTest
    public  void AfterTest(){
        System.out.println("I am After test");
    }
}

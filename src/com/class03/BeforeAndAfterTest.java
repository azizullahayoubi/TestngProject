package com.class03;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterTest {

    @BeforeTest
    public void beforeTest(){
        System.out.println("i am before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I am after test");
    }
    @Test
    public void hello(){
        System.out.println("Hello");

    }

    @Test
    public void method1(){
        System.out.println("I am second test");
    }
    @Test
    public void method2(){
        System.out.println("I am third test");
    }
}


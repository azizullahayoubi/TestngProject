package com.class01;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {

    @BeforeMethod
    public void beforeTestMethod(){
        System.out.println("I am before test method");
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


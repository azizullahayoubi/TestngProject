package com.class02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnAtributeDemo {

    @Test
    public void loginTest(){
        System.out.println("This is log in test");

    }

    @Test (dependsOnMethods = "loginTest")
    public void enterCredentials (){
        System.out.println("This is my dependent method");
    }
}

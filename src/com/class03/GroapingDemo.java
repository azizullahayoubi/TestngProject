package com.class03;

import org.testng.annotations.Test;

public class GroapingDemo {
    @Test(groups = "smoke")
    public void firstMethod(){
        System.out.println("Iam first method");
    }
    @Test(groups = "smoke")
    public void secondMethod(){
        System.out.println("Iam second method");
    }
    @Test(groups = "regretion")
    public void thirdMethod(){
        System.out.println("Iam third method");
    }
    @Test(groups = "smoke")
    public void forthMethod(){
        System.out.println("Iam forth method");
    }
}

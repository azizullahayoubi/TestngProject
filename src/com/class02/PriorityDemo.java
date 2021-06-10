package com.class02;

import javafx.scene.layout.Priority;
import org.testng.annotations.Test;

public class PriorityDemo {
    @Test(priority=2)
    public void firstMethod(){
        System.out.println("This is second method");
    }

    @Test (priority=1)
    public void secondMethod(){
        System.out.println("This is first method");
    }

    @Test(priority=3)
    public void thirdMethod(){
       System.out.println(" This is last method");
    }
}

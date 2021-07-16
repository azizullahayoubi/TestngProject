package com.Homework;

import com.testBases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class Task1 extends CommonMethods {

    @BeforeMethod
    public void  openbrowser(){
        BaseClass.setUpWithSpicificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }

    @Test
    public void validLogin(){

        WebElement userNameBox=driver.findElement(By.cssSelector("input#txtUsername"));
        userNameBox.sendKeys("Admin");
        WebElement passswordBox=driver.findElement(By.cssSelector("input[id  *='txtPassword']"));
        passswordBox.sendKeys("Hum@nhrm123");
        WebElement loginBttton= driver.findElement(By.cssSelector("input[value  *='LOGIN']"));
        loginBttton.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement logo=driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
        Boolean logoisdisplyed=logo.isDisplayed();
        if (logoisdisplyed){
            System.out.println("Syntax logo displayed");
        }else {
            System.out.println("Syntax logo did not displayed");
        }

    }


    @AfterMethod
    public void quitBrowser(){
        closBrowser();
    }
}

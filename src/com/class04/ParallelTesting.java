package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class ParallelTesting  extends CommonMethods {

    @BeforeMethod(alwaysRun = true)
    public  void openBrowserAndLaunch(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver1.exe");
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @Test
    public void ValidLogin()  {

        /*WebElement userName=driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");*/
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement welcomeAttribute= driver.findElement(By.xpath("//*[text()='Welcome Admin']"));
        if (welcomeAttribute.isDisplayed()){
            System.out.println("Test is valid and passed and text displayed: "+welcomeAttribute.getText());
        }else {
            System.out.println("Test is failed");
        }
    }


    @Test
    public void validationOfTitle() {
        String expectedTitle="Human Management System";
        String actualTitle= driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Test is final and title is same");
        }else {
            System.out.println("Test is failed");
        }

    }

}

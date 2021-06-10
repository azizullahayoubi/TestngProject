package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HardAssertionDemo {

    WebDriver driver;
    @BeforeMethod
    public void openBrowserAndLaunch(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void ValidLogin() throws InterruptedException {
        /*WebElement userName=driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");*/
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement welcomeAttribute= driver.findElement(By.xpath("//*[text()='Welcome Admin']"));

            Assert.assertTrue(welcomeAttribute.isDisplayed());
              String textRecived=welcomeAttribute.getText();
              String actualText="Welcome Admin";
              Assert.assertEquals(textRecived,actualText);
            System.out.println("Test is valid and passed and text displayed: "+welcomeAttribute.getText());

    }
    @AfterMethod
    void quitBrowser(){
        driver.quit();
    }
}

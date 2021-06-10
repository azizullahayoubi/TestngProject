package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataProviderDemo {

    @DataProvider
    public  Object[] [] loginData(){
        Object [][] data =new Object[3][2];
        data [0][0]="Admin";
        data [0][1]="Hum@nhrm123";
        data [1][0]="Admin";
        data [1][1]="Hum@nhrm123";
        data [2][0]="Admin";
        data [2][1]="Hum@nhrm123";
        return data;
    }

//    @Test  (DataProvider = "loginData")
//    public void validLogin(String userName, String password){
//
//        System.out.println("UserName is"+userName);
//        System.out.println("Password is" +password);

 //   }
    WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void openBrowserAndLaunch(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }



    @Test(dataProvider = "loginData")
    public void ValidLogin(String userName, String password) throws InterruptedException {
        /*WebElement userName=driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");*/
        driver.findElement(By.id("txtUsername")).sendKeys(userName);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
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

    @AfterMethod(alwaysRun = true)
    public void closBrowser()  {

        driver.quit();
    }
}

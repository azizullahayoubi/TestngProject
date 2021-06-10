package com.testBases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    /**
     * this method will navigate to a website by the given url
     * @param url
     */

    public static void setUpWithSpicificUrl(String url){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
         driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    /**
     * this method will quit and open browser
     */
    public  static void tearDown(){
        if (driver!=null) {
            driver.quit();
        }
    }
}

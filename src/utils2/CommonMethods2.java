package utils2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CommonMethods2 {

           public static WebDriver driver;
           @BeforeMethod(alwaysRun = true)
           public static void setUp() throws IOException {
               ConfigReader.readProperties("C:\\Users\\azizu\\IdeaProjects\\TestngProject\\src\\com\\class04\\config\\config\\config.properties");
               switch (ConfigReader.getPropertyValue("browser")){
                   case "chrome":
                       System.setProperty("webdriver.chrome.driver","drivers/chromedriver1.exe");
                       driver = new ChromeDriver();
                       break;
                   case "Fairfax":
                       System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                       driver = new FirefoxDriver();
                       break;
                   default:
                       throw new RuntimeException("Invalid name of browser");
               }
               driver.get(ConfigReader.getPropertyValue("url"));
               driver.manage().window().maximize();
               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           }


    @AfterMethod(alwaysRun = true)
    public void closBrowser()  {

        driver.quit();
    }
}

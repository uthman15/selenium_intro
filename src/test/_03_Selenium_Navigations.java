package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _03_Selenium_Navigations {
    /*
    Go to https://www.techglobalschool.com
    Refresh the page
    Navigate to https://www.amazon.com/
    Navigate back to TechGlobal web site
    Navigate forward Amazon web site
    Validate the URL of the page
    Validate the title of the page


    EXPECTED RESULT:
    URL  = https://www.amazon.com/
    Title = Amazon.com. Spend less. Smile more.

     */


    public static void main(String[] args) throws InterruptedException {
        //1. Set up driver
        WebDriver driver = Driver.getDriver();


        //2. Validation
        driver.get("https://www.techglobalschool.com");
        driver.navigate().refresh();
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();

        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String expectedURL = "https://www.amazon.com/";

        String actualTitle = driver.getTitle();
        String actualURL = driver.getCurrentUrl();

        if (actualTitle.equals(expectedTitle)) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED!!!");

        if (actualURL.equals(expectedURL)) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED!!!");

        //3. Quit driver
        Driver.quitDriver();
    }
}
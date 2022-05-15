package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
    /*
    TEST CASE
    1. Go to "https://www.apple.com/"
    2. Validate the title of the page is displayed as "Apple"
    */

    public static void main(String[] args) throws InterruptedException {
        //1. Set up Driver
        WebDriver driver = Driver.getDriver();

        //2. Validation
        driver.get("https://www.apple.com/");

        if (driver.getTitle().equals("Apple")) System.out.println("Apple title validation Passed");
        else System.out.println("Apple title validation Failed");

        System.out.println("End of the program");

        //3. Quit Driver
        Driver.quitDriver();


    }
}

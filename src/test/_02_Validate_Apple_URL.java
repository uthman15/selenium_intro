package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {
    /*
    TEST CASE
    1. Go to "https://www.apple.com/"
    2. Validate the URL of the page is displayed as "https://apple.com/"

    NOTE:
    driver.getCurrentUrl(); // this line returns the URL of the current page as a String
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/uthmanmusleh/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.apple.com/");

        if (driver.getCurrentUrl().equals("https://www.apple.com/")) System.out.println("Apple Url validation Passed");
        else System.out.println("Apple url validation Failed");

        System.out.println("End of the program");

        Thread.sleep(3000);
        driver.quit();
    }
}

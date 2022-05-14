package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
    /*
    TEST CASE
    1. Go to "https://www.apple.com/"
    2. Validate the title of the page is displayed as "Apple"
    */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/uthmanmusleh/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://www.apple.com/");

        if (driver.getTitle().equals("Apple")) System.out.println("Apple title validation Passed");
        else System.out.println("Apple title validation Failed");

        System.out.println("End of the program");

        Thread.sleep(3000);
        driver.quit();


    }
}

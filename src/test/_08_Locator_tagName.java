package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _08_Locator_tagName {

    /*
Go to https://www.wikipedia.org/
Validate the WIKIPEDIA heading1 is displayed
Validate the WIKIPEDIA LOGO is displayed
Validate the search input box is displayed
Validate the search button is displayed
Validate the search button is enabled

 */

    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.wikipedia.org/");

        WebElement heading1 = driver.findElement(By.tagName("h1"));
        WebElement logo = driver.findElement(By.cssSelector("div[class='central-featured']"));
        WebElement inputBox = driver.findElement(By.id("search-input"));
        WebElement searchButton = driver.findElement(By.cssSelector("button[class='pure-button pure-button-primary-progressive']"));

        if (heading1.isDisplayed()) System.out.println("The heading1 validation PASSED");
        else System.out.println("The heading1 validation FAILED");

        if (logo.isDisplayed()) System.out.println("The logo validation PASSED");
        else System.out.println("The logo validation FAILED");

        if (inputBox.isDisplayed()) System.out.println("The inputBox validation PASSED");
        else System.out.println("The inputBox validation FAILED");

        if (searchButton.isDisplayed()) System.out.println("The searchButton validation PASSED");
        else System.out.println("The searchButton validation FAILED");

        Driver.quitDriver();

    }
}

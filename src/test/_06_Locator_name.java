package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _06_Locator_name {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        WebElement searchBar = driver.findElement(By.name("q"));

        if (searchBar.isDisplayed()) System.out.println("The searchBar validation PASSED");
        else System.out.println("The searchBar validation FAILED");

        Driver.quitDriver();
    }
}

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _09_Locator_linkText_partialLinkText {
    public static void main(String[] args) {
        /*
        Go to https://www.google.com
        Validate the Gmail, Images, About and Store links are displayed and enabled
        */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        WebElement imagesLink = driver.findElement(By.linkText("Images"));
        WebElement aboutLink = driver.findElement(By.linkText("About"));
        WebElement storeLink = driver.findElement(By.linkText("Store"));

        if (gmailLink.isDisplayed() && gmailLink.isEnabled()) System.out.println("The gmailLink validation Passed");
        else System.out.println("The gmailLink validation FAILED");

        if (imagesLink.isDisplayed() && imagesLink.isEnabled()) System.out.println("The imagesLink validation Passed");
        else System.out.println("The imagesLink validation FAILED");

        if (aboutLink.isDisplayed() && aboutLink.isEnabled()) System.out.println("The aboutLink validation Passed");
        else System.out.println("The aboutLink validation FAILED");

        if (storeLink.isDisplayed() && storeLink.isEnabled()) System.out.println("The storeLink validation Passed");
        else System.out.println("The storeLink validation FAILED");

        Driver.quitDriver();

    }
}

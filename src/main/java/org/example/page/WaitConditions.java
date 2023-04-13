package org.example.page;

import org.example.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitConditions {

    protected static final int EXPLICIT_MIN_TIMEOUT = 10;

    protected Driver driver;

    protected WebDriver webDriver;

    protected void waitForElementToBeVisible(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(EXPLICIT_MIN_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    protected void waitForElementToBeClickable(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(EXPLICIT_MIN_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
}

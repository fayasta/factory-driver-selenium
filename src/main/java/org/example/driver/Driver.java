package org.example.driver;

import org.openqa.selenium.WebDriver;

public class Driver {

    private String browser;

    private WebDriver webDriver;

    public Driver(String browser, WebDriver webDriver){
        this.browser = browser;
        this.webDriver = webDriver;
    }

    public String getBrowser(){
        return browser;
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }

}

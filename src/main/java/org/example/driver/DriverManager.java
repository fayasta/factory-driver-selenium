package org.example.driver;

import org.example.driver.factory.DriverFactory;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class DriverManager {

    private InheritableThreadLocal<Driver> driverInheritableThreadLocal = new InheritableThreadLocal<Driver>();

    private String url = "https://www.google.com";

    private String browser = "chrome";

    private DriverFactory driverFactory = new DriverFactory();

    private boolean cleanSession = true;

    public void populateDriver() throws IOException {
        WebDriver driver = driverFactory.newInstance(url, browser);
        if(isCleanSession()){
            driver.manage().deleteAllCookies();
        }
        driverInheritableThreadLocal.set(new Driver(browser,driver));
    }

    public Driver getDriver(){
        return driverInheritableThreadLocal.get();
    }

    public void deleteDriver(){
        Driver driver = getDriver();
        if(driver != null && driver.getBrowser() != null){
            try{
                driver.getWebDriver().quit();
            }catch (Exception e){
            // TODO IMPLEMENT LOGGER
                System.out.println("DriverManager. Delete Driver. Unable to close all browser instances.");
            }
        }
    }

    public DriverFactory getDriverFactory(){
        return driverFactory;
    }

    public void setDriverFactory(){
        this.driverFactory = driverFactory;
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getBrowser(){
        return browser;
    }

    public void setBrowser(){
        this.browser = browser;
    }

    public boolean isCleanSession(){
        return cleanSession;
    }

    public void setCleanSession(){
        this.cleanSession = cleanSession;
    }
}

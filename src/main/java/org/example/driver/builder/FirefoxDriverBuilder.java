package org.example.driver.builder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxDriverBuilder extends DriverBuilder{

    public FirefoxDriverBuilder(){

    }

    @Override
    public WebDriver build(){

        return new FirefoxDriver();
    }

    @Override
    public DriverBuilder loadCapabilities(){
        return this;
    }
}

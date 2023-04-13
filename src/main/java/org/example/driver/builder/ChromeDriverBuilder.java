package org.example.driver.builder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeDriverBuilder extends DriverBuilder{

    @Override
    public WebDriver build(){
        return new ChromeDriver();
    }

    @Override
    public DriverBuilder loadCapabilities(){
        return this;
    }
}

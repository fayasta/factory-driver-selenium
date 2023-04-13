package org.example.driver.builder;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

public abstract class DriverBuilder {

    protected Capabilities capabilities;

    public abstract WebDriver build();

    public abstract DriverBuilder loadCapabilities();




}

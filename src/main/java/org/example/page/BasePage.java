package org.example.page;


import org.example.driver.Driver;

import static org.openqa.selenium.support.PageFactory.initElements;

public class BasePage extends  WebOperations{

    public BasePage(Driver driver){
        this.driver = driver;
        this.webDriver = driver.getWebDriver();
        initElements(webDriver, this);
    }



}

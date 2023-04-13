package org.example.driver.factory;


import org.example.driver.builder.ChromeDriverBuilder;
import org.example.driver.builder.FirefoxDriverBuilder;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver;
import static java.util.concurrent.TimeUnit.SECONDS;

public class DriverFactory {

    private static final String CHROME = "chrome";
    private static final String FIREFOX = "firefox";
    private static final String IEXPLORER = "iexplorer";

    private ChromeDriverBuilder chromeBuilder = new ChromeDriverBuilder();

    private FirefoxDriverBuilder firefoxBuilder;

    public WebDriver newInstance (String url, String browser) throws IOException{

        WebDriver driver = createNewDriver(browser);

        driver.manage().timeouts().implicitlyWait(10,SECONDS);

        try{
            driver.get(url);
        }catch (Exception e){
            driver.navigate().refresh();
        }

        return driver;
    }

    //Extender este metodo tan cuanto lo necesitemos para nuevos drivers como: Iexplorer,etc
    private WebDriver createNewDriver(String browser){
        WebDriver driver;

        switch (browser){
            case FIREFOX:
                firefoxdriver().setup();
                driver = firefoxBuilder.loadCapabilities().build();
                break;
            default:
                chromedriver().setup();
                driver = chromeBuilder.build();
        }
        return driver;
    }

    public ChromeDriverBuilder getChromeBuilder(){
        return chromeBuilder;
    }

    public void setChromeBuilder(ChromeDriverBuilder chromeBuilder){
        this.chromeBuilder = chromeBuilder;
    }



}

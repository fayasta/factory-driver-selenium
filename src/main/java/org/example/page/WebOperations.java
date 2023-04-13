package org.example.page;

import org.openqa.selenium.WebElement;

public class WebOperations extends WaitConditions{

    private static final String EMPTY = "";

    public static String getTextFromWebElement(final WebElement webElement){

        if(webElement == null){
            return EMPTY;
        }

        String webElementText = webElement.getText();

        if(webElementText != null && !webElementText.isEmpty()){
            return webElementText;
        }
        webElementText = webElement.getAttribute("value");
        if(webElementText != null){
            return webElementText;
        }else{
            webElementText = webElement.getAttribute("textContent");
            return webElementText != null ? webElementText : EMPTY;
        }
    }

    protected boolean isVisible(WebElement webElement){
        try{
            return webElement.isEnabled();
        }catch (Exception e){
            return false;
        }
    }

    protected void click(WebElement webElement){
        webElement.click();
    }

    protected void fillText(WebElement webElement, String text){
        webElement.sendKeys(text);
    }
}

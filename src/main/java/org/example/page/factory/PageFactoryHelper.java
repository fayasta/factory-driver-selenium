package org.example.page.factory;


import org.example.driver.Driver;
import org.example.driver.DriverManager;

public class PageFactoryHelper {

    private DriverManager driverManager;

    public <T> T newInstance(Class<T> classT){
        try{
            return classT.getDeclaredConstructor(Driver.class).newInstance(driverManager.getDriver());
        }catch (Exception e){
            System.out.println(e.getMessage() + e);
        }
        return null;
    }

    public <T> T newInstance(Class<T> classT, Driver driver){
        try{
            return classT.getDeclaredConstructor(Driver.class).newInstance(driver);
        }catch (Exception e){
            System.out.println(e.getMessage() + e);
        }
        return null;
    }

}

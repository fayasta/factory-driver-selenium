package example;

import org.example.driver.DriverManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test_Example {

    DriverManager driverManager = new DriverManager();

    @Test
    public void method (){
        try {
            driverManager.populateDriver();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driverManager.deleteDriver();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

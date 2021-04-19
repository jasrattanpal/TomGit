package com.bjss.testexample;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManger {

    private WebDriver driver;


    public void start() {

        String driverFilePath = BjssSteps.class
                .getClassLoader()
                .getResource("geckodriver.exe").getFile();

        System.setProperty("webdriver.gecko.driver", driverFilePath);

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }

    public void quit(){

        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }

}

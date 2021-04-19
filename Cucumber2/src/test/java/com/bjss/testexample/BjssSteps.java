package com.bjss.testexample;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class BjssSteps {

    private WebDriverManger webDriverManger;

    public BjssSteps(WebDriverManger webDriverManger){
        this.webDriverManger =webDriverManger;

    }

    private final String FIRST_NAME = "Jas";
    private final String LAST_NAME = "RATTANPAL";
    private final String EMAIL = "JAVA.AUTOMATION@TEST.COM";


    @Given("^the user has navigated to the BJSS homepage$")
    public void naviagateToBjss() {

        webDriverManger.start();
        webDriverManger.getDriver().navigate().to("https://bjss.com");
        webDriverManger.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    @When("^When they click the menu$")
    public void clickTheMenu() {
        webDriverManger.getDriver().findElement(By.id("cookie_action_close_header")).click();
        webDriverManger.getDriver().findElement(By.linkText("About BJSS"));
        webDriverManger.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Then("^Click the Contact$")
    public void clickThecontact() {
        webDriverManger.getDriver().findElement(By.linkText("Contact")).click();
        boolean islogodisplayed = webDriverManger.getDriver().findElement(By.xpath("//img[@id='logo']")).isDisplayed();
        Assert.assertTrue("logo is not displayed", islogodisplayed);
        webDriverManger.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Then("^careers is displayed$")
    public void careersdisplayed() {
        boolean linkIsDisplayed = webDriverManger.getDriver().findElement(By.linkText("Careers")).isDisplayed();
        Assert.assertTrue(" Careers link was not displayed", linkIsDisplayed);
        webDriverManger.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("^The careers button selected$")
    public void carrersbutton() {

        webDriverManger.getDriver().findElement(By.linkText("Careers")).click();
        webDriverManger.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("^Check Subscribe to our Newsletter$")
    public void subscribedisplayed() {
        boolean linkIsDisplayed = webDriverManger.getDriver().findElement(By.xpath("//input[@id='et_pb_signup_firstname']")).isDisplayed();
        Assert.assertTrue("Subscribe was not displayed", linkIsDisplayed);
        webDriverManger.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Then("^input first last name and email$")
    public void inputfirstname() {
        webDriverManger.getDriver().findElement(By.xpath("//input[@id='et_pb_signup_firstname']")).sendKeys(FIRST_NAME);
        webDriverManger.getDriver().findElement(By.xpath("//input[@id='et_pb_signup_lastname']")).sendKeys(LAST_NAME);
        webDriverManger.getDriver().findElement(By.xpath("//input[@id='et_pb_signup_email']")).sendKeys(EMAIL);
        webDriverManger.quit();
    }

   // aditional test for call multiple methods
    @Given("^homepage and menu")
    public void homeAndMenu() {
        naviagateToBjss();
        clickTheMenu();
        webDriverManger.quit();
    }

}

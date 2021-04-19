package com.bjss.testexample;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;


public class AgileProjectDeliverySteps {

    private WebDriverManger webDriverManger;

    public AgileProjectDeliverySteps(WebDriverManger webDriverManger) {
        this.webDriverManger = webDriverManger;



    }

    private final String FIRST_NAME = "Jas";
    private final String LAST_NAME = "RATTANPAL";
    private final String EMAIL = "JAVA.AUTOMATION@TEST.COM";

    @When("^the user checks logo$")
    public void clickcontacttest() {
        webDriverManger.getDriver().findElement(By.linkText("Contact")).click();
        boolean islogodisplayed = webDriverManger.getDriver().findElement(By.xpath("//img[@id='logo']")).isDisplayed();
        Assert.assertTrue("logo is not displayed", islogodisplayed);
        webDriverManger.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //     webDriverManger.quit();


    }

    @Then("^get in touch button is selected$")
    public void getintouchbutton() {
        webDriverManger.getDriver().findElement(By.id("cookie_action_close_header")).click();
        boolean linkIsDisplayed = webDriverManger.getDriver().findElement(By.xpath("//a[@class='et_pb_button et_pb_button_0 popmake-225979 et_pb_bg_layout_dark pum-trigger']")).isDisplayed();
        Assert.assertTrue(" Careers link was not displayed", linkIsDisplayed);

        webDriverManger.getDriver().findElement(By.xpath("//a[@class='et_pb_button et_pb_button_0 popmake-225979 et_pb_bg_layout_dark pum-trigger']")).click();
        webDriverManger.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("^Check Get in Touch form is displayed$")
    public void getintouchform() {
        boolean isfirstname = webDriverManger.getDriver().findElement(By.xpath("/html/body/div[29]/div/div/div")).isDisplayed();
        Assert.assertTrue("Get in touch form is not displayed", isfirstname);
        webDriverManger.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //   webDriverManger.getDriver().findElement(By.cssSelector("#sf_form_salesforce_w2l_lead_12 > div.sf_field.sf_field_first_name.sf_type_text > input")).sendKeys(FIRST_NAME);
        webDriverManger.getDriver().findElement(By.xpath("/html[1]/body[1]/div[29]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys(FIRST_NAME);
        webDriverManger.getDriver().findElement(By.xpath("/html[1]/body[1]/div[29]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys(LAST_NAME);
        webDriverManger.getDriver().findElement(By.xpath("/html[1]/body[1]/div[29]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")).sendKeys(EMAIL);
        webDriverManger.getDriver().findElement(By.xpath("/html[1]/body[1]/div[29]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/input[1]")).sendKeys("07813329898");
        webDriverManger.getDriver().findElement(By.xpath("/html[1]/body[1]/div[29]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/textarea[1]")).sendKeys("Its all about the testing");
        webDriverManger.getDriver().findElement(By.xpath("/html[1]/body[1]/div[29]/div[1]/button[1]")).click();

    }
    @Then("^Check Leeds Office location$")
    public void leedsofficelocation() {
       webDriverManger.getDriver().findElement(By.className("et_pb_text_inner")).isDisplayed();
       webDriverManger.getDriver().findElement(By.xpath("//a[@href='https://www.google.com/maps/place/BJSS/@53.7959205,-1.5521279,17z/data=!4m5!3m4!1s0x0:0x5433a6b97e9ed332!8m2!3d53.7953692!4d-1.5508619']")).click();
       webDriverManger.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       webDriverManger.quit();
    }
}

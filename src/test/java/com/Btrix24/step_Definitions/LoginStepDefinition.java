package com.Btrix24.step_Definitions;

import com.Btrix24.pages.homePage.ActivityStream;
import com.Btrix24.utilities.Driver;
import com.Btrix24.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class LoginStepDefinition {

    Pages pages = new Pages();

    WebDriver driver = Driver.getDriver();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {

        pages.loginPage().goToLandingPage();
    }

//    @When("user enter username and password")
//    public void user_enter_username_password( DataTable credentails) {
//            for (Map<Object, Object> data : credentails.asMaps(String.class, String.class)) {
//                pages.loginPage().passwordInput.sendKeys((CharSequence)data.get("username"));
//                pages.loginPage().passwordInput.sendKeys((CharSequence) data.get("password"));
//                pages.loginPage().loginBtn.click();
//            }
//        }


    @Then("homepage logo should display")
    public void homepage_logo_should_display() {
        ActivityStream homePage = new ActivityStream();
        homePage.homePageLogo.isDisplayed();
        String expected = "NextbaseCRM";
        String actual = homePage.homePageLogo.getText();
        Assert.assertEquals(expected, actual);
        System.out.println(expected + "  " + actual);
    }


}









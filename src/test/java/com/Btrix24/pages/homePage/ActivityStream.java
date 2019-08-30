package com.Btrix24.pages.homePage;

import com.Btrix24.utilities.BasePage;
import com.Btrix24.utilities.BrowserUtils;
import com.Btrix24.utilities.Driver;
import com.Btrix24.utilities.Pages;
import cucumber.api.Scenario;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.Btrix24.utilities.BrowserUtils.waitForVisibility;

public class ActivityStream extends Pages {


    public ActivityStream(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    Scenario scenario;

    @FindBy(css = "[class='logo-text']")
    public WebElement homePageLogo;

    @FindBy(css = "[id='feed-add-post-form-tab-tasks']")
    public  WebElement taskElement;

    @FindBy(css = "[data-bx-id='task-edit-title']")
    public WebElement thingToDoInput;

    @FindBy(css = "[id='blog-submit-button-save']")
    public WebElement sendBtn;

    @FindBy(css = "[class='feed-create-task-popup-content']")
    public WebElement popUpContent;

    @FindBy(css = "[class='popup-window-button']")
    public WebElement viewTaskBtn;

    @FindBy(css = "[class='pagetitle-item']")
    public WebElement pupUpTastTitle;

    @FindBy(css = "[[class='intranet-license-restriction-title']']")
    public WebElement EULAviolation;




    public void sentTask(String message) {
//        if (EULAviolation.isDisplayed()) {
////            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
////            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
////            scenario.embed(image, "image/png");
//            Driver.closeDriver();
//            System.out.println("EULA violation, try again");
//        } else {
            taskElement.click();
            thingToDoInput.sendKeys(message);
            sendBtn.click();
            BrowserUtils.waitFor(3);
        }


//    public void verifyMessagesSent(){
//
//        waitForVisibility(popUpContent,3);
//        viewTaskBtn.click();
//        System.out.println( pupUpTastTitle.getText());
//
//    }







}

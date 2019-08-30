package com.Btrix24.pages.TasksPage;

import com.Btrix24.utilities.Driver;
import com.Btrix24.utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks extends Pages {

    public Tasks(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "[class='menu-item-link'][title='Tasks']")
    public WebElement tasksMenue;

    @FindBy(css = "[placeholder='search']")
    public WebElement searchInbox;

    @FindBy(css = "[class='main-ui-item-icon main-ui-search']")
    public WebElement searchBtn;

    public void verifyMessageSent(String message){
        tasksMenue.click();
        searchInbox.sendKeys(message);
        searchBtn.click();
    }



}

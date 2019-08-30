package com.Btrix24.pages.sideMenuBar;

import com.Btrix24.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Modules extends Pages {

    public Modules(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(css = "[class='menu-item-link'][title='Activity Stream']")
    public WebElement ActivityStreamModule;

    @FindBy(css = "[class='menu-item-link'][title='Tasks']")
    public WebElement taskModule;





}

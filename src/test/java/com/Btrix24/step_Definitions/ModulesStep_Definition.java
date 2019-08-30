package com.Btrix24.step_Definitions;

import com.Btrix24.pages.sideMenuBar.Modules;
import com.Btrix24.utilities.BasePage;
import com.Btrix24.utilities.Driver;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ModulesStep_Definition extends BasePage {


    @Then("click on  {string}")
    public void clickOn  (String module) {

        navigateToModule(module); //vasly code modifiy

        //my code
//            String moduleLocator = "[class='menu-item-link'][title='" + module + "']";
//            Driver.getDriver().findElement(By.cssSelector(moduleLocator)).click();
        }



    @Then("the page title should be {string}")
    public void the_page_title_should_be(String title) {

        String actualTitle = getPageTitle();
        Assert.assertEquals(title,actualTitle);
        System.out.println("Actual Title is "+actualTitle);
        System.out.println("Senario out line title is "+title);

        }

    }




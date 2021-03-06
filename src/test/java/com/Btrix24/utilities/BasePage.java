package com.Btrix24.utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

    //we don't want to access these variables outside
    private static final Logger logger = LogManager.getLogger();


    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(css = "h1[class='oro-subtitle']")
    protected WebElement pageSubTitle;

    @FindBy(css = "[id='user-name']")
    protected WebElement userMenuName;


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    /**
     * @return page name, for example: Dashboard
     */
    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }


    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Integer.parseInt(ConfigurationReader.getProperty("SHORT_WAIT")));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
            logger.info("Loader mask gone...");
        } catch (Exception e) {
            logger.error("Loader mask doesn't present.");
            logger.error(e);
        }
    }

    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
     *
     * @param tab
     * @param module
     */
    public void navigateToModule( String module) {
        String moduleLocator = "[class='menu-item-link'][title='" + module + "']";

        try {
            BrowserUtils.waitForPresenceOfElement(By.cssSelector(moduleLocator), Integer.parseInt(ConfigurationReader.getProperty("SHORT_WAIT")));
            BrowserUtils.waitForVisibility(By.cssSelector(moduleLocator), Integer.parseInt(ConfigurationReader.getProperty("SHORT_WAIT")));
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.cssSelector(moduleLocator)));
            Driver.getDriver().findElement(By.cssSelector(moduleLocator)).click();
        } catch (Exception e) {
            logger.error("Failed to click on :: "+module);
            logger.error(e);
            BrowserUtils.waitForStaleElement(Driver.getDriver().findElement(By.cssSelector(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.cssSelector(moduleLocator)),  Integer.parseInt(ConfigurationReader.getProperty("SHORT_WAIT")));
        }
    }

    public String getUserMenuName(){
        waitUntilLoaderScreenDisappear();
        return userMenuName.getText();
    }

    public String getPageTitle(){
        waitUntilLoaderScreenDisappear();
        return Driver.getDriver().getTitle();
    }

}

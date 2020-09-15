package automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import page.Google_Search;
import utility.BrowserUtility;
import utility.Configuration_Reader;

import java.net.URL;

@Test
public class Searching_Appium_Google_Test extends Google_Search {


    @FindBy(xpath = "//input[@name='q']")
    protected WebElement browsing;
    @FindBy(xpath = "//form[@id='tsf']//div//div//div//div//input[@name='btnK']")
    protected WebElement search;


    public void clickOnBrowser() {

        BrowserUtility.wait(3);
        browsing.click();
        browsing.sendKeys("Appium");
        BrowserUtility.wait(3);
    }

    public void clickOnSearch() {
        BrowserUtility.wait(3);
        search.click();
        BrowserUtility.wait(3);
    }
}

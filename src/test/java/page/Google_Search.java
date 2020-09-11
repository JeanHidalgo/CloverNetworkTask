package page;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utility.Configuration_Reader;
import utility.Driver;

public class Google_Search {

    public static  WebDriver driver = Driver.getDriver();

    protected WebDriverWait hold = new WebDriverWait(driver, 25);
    @BeforeTest
    public void getUrl(){
        driver.get("https://www.google.com");


    }
@AfterTest

public void tearDown(){
        driver.quit();
}
    public Google_Search() {
        PageFactory.initElements(driver, this);
    }
}

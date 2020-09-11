package automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utility.BrowserUtility;

public class Simple_Task_1 {
    //In this task you will se It was just a direct test using testNG framework
    @Test
    public void task_1(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        WebElement browsing = driver.findElement(By.xpath("//input[@name='q']"));
        browsing.click();
        browsing.sendKeys("Appium");
        BrowserUtility.wait(3);
        WebElement search = driver.findElement(By.xpath("//form[@id='tsf']//div//div//div//div//input[@name='btnK']")) ;
        search.click();
        BrowserUtility.wait(3);
        driver.close();

    }
}

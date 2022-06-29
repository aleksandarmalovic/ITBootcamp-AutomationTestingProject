package demoqa.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DynamicProperties {
    public WebDriver driver;
    public WebDriverWait wait;
    public By visibleAfter = By.id("visibleAfter");
    public By enableAfter = By.id("enableAfter");

    public DynamicProperties(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public WebElement getVisibleAfter() {
        return driver.findElement(visibleAfter);
    }
    public WebElement getEnableAfter() {
        return driver.findElement(enableAfter);
    }
    public void clickVisibleAfter(){
        getVisibleAfter().click();
    }
    public boolean booleanClickVisibleAfter(){
        getVisibleAfter().click();
        return true;
    }
    public void clickEnableAfter(){
        getEnableAfter().click();
    }

    public boolean booleanClickEnableAfter(){
        getEnableAfter().click();
        return true;
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
    }
    public List<WebElement> va() {
        return driver.findElements(visibleAfter);
    }
    public boolean enableAfterIsEnable () {
        if (getEnableAfter().isEnabled()){
            return true;
        }
        return false;
    }




}

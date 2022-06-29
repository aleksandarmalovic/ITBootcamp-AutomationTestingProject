package demoqa.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Buttons {
    public WebDriver driver;
    public WebDriverWait wait;
    By doubleClickButton = By.id("doubleClickBtn");
    By rightClickButton = By.id("rightClickBtn");
    By dynamicClickButton = By.xpath("//button[@id='upNVZ']");
    By buttons = By.tagName("button");
    By dynamicClickMessage = By.id("dynamicClickMessage");
    public By doubleClickMessage = By.id("doubleClickMessage");
    public By rightClickMessage = By.id("rightClickMessage");
    public By dynamicClickButtonMessage = By.id("ONBXi");

    public Buttons(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public WebElement getDynamicMsg() {
        return driver.findElement(dynamicClickMessage);
    }
    public WebElement getDoubleClickMessage() {
        return driver.findElement(doubleClickMessage);
    }
    public WebElement getRightClickMessage() {
        return driver.findElement(rightClickMessage);
    }

    public WebElement getDoubleClickButton() {
        return driver.findElement(doubleClickButton);
    }
    public WebElement getRightClickButton() {
        return driver.findElement(rightClickButton);
    }
    public WebElement getDynamicClickButton() {
        return driver.findElement(dynamicClickButton);
    }
    public void doDoubleClick() {
        Actions action = new Actions(driver);
        action.doubleClick(getDoubleClickButton()).build().perform();
    }
    public void doRightClick() {
        Actions action = new Actions(driver);
        action.contextClick(getRightClickButton()).build().perform();
    }
    public void doDynamicClick() {
        Actions action = new Actions(driver);
        action.click(getDynamicClickButton()).build().perform();
    }
    public String sGetDoubleClickMessage() {
        return getDoubleClickMessage().getText();
    }
    public String sGetRightClickMessage() {
        return getRightClickMessage().getText();
    }
    public void dynamicClick() {
        driver.findElements(buttons).get(3).click();
    }
    public WebElement getDynamicClickMessage() {
        return driver.findElement(dynamicClickMessage);
    }
    public String sGetDynamicClickMessage(){
        return getDynamicClickMessage().getText();
    }


}

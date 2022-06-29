package demoqa.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class TextBox {
    public WebDriver driver;
    public WebDriverWait wait;
    By header = By.className("main-header");
    By fullName = By.id("userName");
    By email = By.id("userEmail");
    By curAddress = By.id("currentAddress");
    By perAddress = By.id("permanentAddress");
    By submitButton = By.id("submit");
    By currentText = By.id("output");
    public TextBox(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    public WebElement getFullName(){
        return driver.findElement(fullName);
    }
    public WebElement getEmail(){
        return driver.findElement(email);
    }
    public WebElement getCurrentAddress(){
        return driver.findElement(curAddress);
    }
    public WebElement getPermanentAddress(){
        return driver.findElement(perAddress);
    }
    public WebElement getSubmitButton(){
        return driver.findElement(submitButton);
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
    }

    public void addFullName(String Name){
        getFullName().sendKeys(Name);
    }
    public void addEmail(String email){
        getEmail().sendKeys(email);
    }
    public void addCurAddress(String cAddress){
        getCurrentAddress().sendKeys(cAddress);
    }
    public void addPerAddress(String pAddress){
        getPermanentAddress().sendKeys(pAddress);
    }
    public void submit(){
        scrollDown();
        getSubmitButton().click();
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public String getCurrentText(){
        return driver.findElement(currentText).getText();
    }
    public String getHeaderText(){
        return driver.findElement(header).getText();
    }
    public final String sFullName = "Aleksandar Malovic";
    public final String sEmail = "demoqa.automation@gmail.com";
    public final String sCurAddress = "Automatska";
    public final String sPerAddress = "Junior";

}

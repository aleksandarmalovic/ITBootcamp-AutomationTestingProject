package demoqa.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Links {
    public WebDriver driver;
    public WebDriverWait wait;
    By header = By.className("main-header");

    By responseCode = By.id("linkResponse");
    By links = By.xpath("//*[@href=\"https://demoqa.com\" and @target=\"_blank\"]");
    By apiLinks = By.xpath("//*[@href=\"javascript:void(0)\"]");
    By titles = By.tagName("strong");
    By linkTitles = By.tagName("p");
    public Links(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public List<WebElement> linksList () {
        return driver.findElements(links);
    }
    public List<WebElement> linksApiList () {
        return driver.findElements(apiLinks);
    }
    public void linksListClick (int i){
        linksList().get(i).click();
    }
    public void linksApiListClick (int i){
        linksApiList().get(i).click();
    }
    public String currentUrl() {
        return driver.getCurrentUrl();
    }
    public void switchToTab(int i) {
        Set<String> alltabs = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(alltabs);
        driver.switchTo().window(tabs.get(i));
    }
    public String getHeaderText(){
        return driver.findElement(header).getText();
    }




}

package demoqa.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {
    public WebDriver driver;
    public WebDriverWait wait;
    By ExpandArrow = By.cssSelector("#tree-node > ol > li > span > button > svg");
    By CheckHome = By.cssSelector("#tree-node > ol > li > span > label");
    By ExpandPlus = By.cssSelector("#tree-node > div > button.rct-option.rct-option-expand-all > svg");
    By CollapseMinus = By.cssSelector("#tree-node > div > button.rct-option.rct-option-collapse-all > svg");
    By ExpandDesktop = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > button");
    By ExpandDocuments = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > span > button");
    By ExpandDownloads = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(3) > span > button");
    By ExpandWorkSpace = By.cssSelector("#tree-node > ol > li > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li:nth-child(1) > span > button");
    By ExpandOffice = By.cssSelector("#tree-node > ol > li > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li:nth-child(2) > span > button");
    By ArrowsList = By.className("rct-icon rct-icon-expand-open");
    public CheckBox(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public WebElement getCheckMain() {
        return driver.findElement(CheckHome);
    }
    public WebElement getExpandArrow() {
        return driver.findElement(ExpandArrow);
    }
    public WebElement getExpandPlus() {
        return driver.findElement(ExpandPlus);
    }
    public WebElement getCollapseMinus() {
        return driver.findElement(CollapseMinus);
    }
    public WebElement getExpandDesktop() {
        return driver.findElement(ExpandDesktop);
    }
    public WebElement getExpandDocuments() {
        return driver.findElement(ExpandDocuments);
    }
    public WebElement getExpandDownloads() {
        return driver.findElement(ExpandDownloads);
    }
    public WebElement getExpandWorkSpace() {
        return driver.findElement(ExpandWorkSpace);
    }
    public WebElement getExpandOffice() {
        return driver.findElement(ExpandOffice);
    }
    public void CheckMain() {
        getCheckMain().click();
    }
    public void ArrowButtonHome() {
        getExpandArrow().click();
    }
    public void PlusButton() {
        getExpandPlus().click();
    }
    public void MinusButton() {
        getCollapseMinus().click();
    }
    public void ArrowButtonDesktop() {
        if(getExpandArrow().isEnabled()){
            getExpandDesktop().click();
        }
    }
    public void ArrowButtonDownloads() {
        if (getExpandArrow().isEnabled()) {
            getExpandDownloads().click();
        }
    }
    public void ArrowButtonDocuments() {
        if (getExpandArrow().isEnabled()) {
            getExpandDocuments().click();
        }
    }
    public void ArrowButtonWorkSpace() {
        if (getExpandArrow().isEnabled()) {
            getExpandWorkSpace().click();
        }
    }
    public void ArrowButtonOffice() {
        if (getExpandDocuments().isEnabled()) {
            getExpandOffice().click();
        }
    }
    public void clickArrow(int i) {
        driver.findElements(ArrowsList).get(i).click();
    }
}

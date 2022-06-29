package demoqa.pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v100.dom.DOM;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class BookStoreApplication {
    public final String url = "https://demoqa.com/books";
    public WebDriver driver;
    public WebDriverWait wait;
    public Action action;
    By header = By.className("main-header");
    By login = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[1]");
    By bookStore = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[2]");
    By profile = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[3]");
    By bookStoreApi = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[4]");
    By message = By.cssSelector("#userForm > div:nth-child(1)");

    public BookStoreApplication(WebDriver driver, WebDriverWait wait, Action action) {
        this.driver = driver;
        this.wait = wait;
        this.action = action;
    }
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
    }
    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-300)");
    }
    public void changeHeight() {
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("document.querySelector('.body-height').style.height = '400vh'");
    }
    public void zoomOut() {
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("document.body.style.zoom = '50%';");
        scrollUp();
    }
    public WebElement getLogin() {
        return driver.findElement(login);
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }
    public String getHeaderText(){
        return driver.findElement(header).getText();
    }
    public String getMessage() {
        return driver.findElement(message).getText();
    }

    public WebElement getBookStore() {
        return driver.findElement(bookStore);
    }
    public WebElement getProfile(){
        return driver.findElement(profile);
    }
    public WebElement getBookStoreApi() {
        return driver.findElement(bookStoreApi);
    }
    public void goToLogin (){
        getLogin().click();
    }
    public void goToBookStore (){
        getBookStore().click();
    }

    public void goToProfile (){
        getProfile().click();
    }
    public void goToBookStoreApi () {
        getBookStoreApi().click();
    }

}

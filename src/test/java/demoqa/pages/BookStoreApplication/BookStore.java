package demoqa.pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;
import java.util.List;

public class BookStore {
    public final String url = "https://demoqa.com/books";
    public WebDriver driver;
    public WebDriverWait wait;
    By bookStoreApp = By.xpath("//*[@class=\"element-list collapse show\"]/ul/li");
    By searchBox = By.id("searchBox");
    By selectRows = By.tagName("select");
    By pages = By.xpath("//*[@type=\"number\"]");
    By title = By.className("action-buttons");
    By backButton = By.id("addNewRecordButton");
    By next = By.xpath("//button[text()=\"Next\"]");
    By previous = By.xpath("//button[text()=\"Previous\"]");
    By loginButton = By.id("login");
    By listOfBooks = By.className("mr-2");

    public BookStore(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public final String urlBookStore = "https://demoqa.com/books";

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }
    public void loginButtonClick() {
        driver.findElement(loginButton).click();
    }
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
    }

    public void clickBook (int i){
        if (i == 7) {
            scrollDown();
            driver.findElements(listOfBooks).get(i).click();
        } else {
            driver.findElements(listOfBooks).get(i).click();
        }
    }

}

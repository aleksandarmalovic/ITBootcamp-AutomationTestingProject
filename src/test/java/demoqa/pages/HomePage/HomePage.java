package demoqa.pages.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public final String url = "https://demoqa.com/";
    public WebDriver driver;
    public WebDriverWait wait;
    public By logo = By.cssSelector("#app > header > a > img");
    public By banner = By.className("banner-image");
    public By card = By.cssSelector("card-up");

    public By elements = By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1)");
    public By forms = By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(2)");
    public By alerts = By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(3)");
    public By widgets = By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(4)");
    public By interaction = By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(5)");
    public By bookStoreApplication = By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(6)");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public WebElement getLogo() {
        return driver.findElement(logo);
    }
    public WebElement getBanner() {
        return driver.findElement(banner);
    }
    public WebElement getCard() {
        return driver.findElement(card);
    }
    public WebElement getElements() {
        return driver.findElement(elements);
    }
    public WebElement getForms() {
        return driver.findElement(forms);
    }
    public WebElement getAlerts() {
        return driver.findElement(alerts);
    }
    public WebElement getWidgets() {
        return driver.findElement(widgets);
    }
    public WebElement getInteraction() {
        return driver.findElement(interaction);
    }
    public WebElement getBookStoreApplication() {
        return driver.findElement(bookStoreApplication);
    }
    public void goToElements() {
        getElements().click();
    }
    public void goToForms() {
        getForms().click();
    }
    public void goToAlerts() {
        getAlerts().click();
    }
    public void goToWidgets() {
        getWidgets().click();
    }
    public void goToInteraction() {
        getInteraction().click();
    }
    public void goToBookStoreApplication() {
        getBookStoreApplication().click();
    }
    public void waitTime() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
    }
}

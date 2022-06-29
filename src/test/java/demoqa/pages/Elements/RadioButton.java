package demoqa.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton {
    public WebDriver driver;
    public WebDriverWait wait;
    By header = By.className("main-header");
    By yesButton = By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(2)");
    By impressiveButton = By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(3)");
    By noButton = By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div.custom-control.disabled.custom-radio.custom-control-inline");

    By buttons = By.tagName("label");
    By message = By.className("text-success");

    public RadioButton(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public String getMessage() {
        return driver.findElement(message).getText();
    }
    public void clickButton (int i){
        driver.findElements(buttons).get(i).click();

        if (i>=0 && i <=2) {
            driver.findElements(buttons).get(i).click();
        } else {
            System.out.println("Wrong number of button.");
        }
    }
    public String getHeaderText(){
        return driver.findElement(header).getText();
    }

}

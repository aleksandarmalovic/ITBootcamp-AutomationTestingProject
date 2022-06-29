package demoqa.pages.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinksImages {
    public WebDriver driver;
    public WebDriverWait wait;
    public Action action;

    public BrokenLinksImages(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

}

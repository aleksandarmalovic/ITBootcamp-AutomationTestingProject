package demoqa.pages.BasePage;

import demoqa.pages.BookStoreApplication.BookStore;
import demoqa.pages.BookStoreApplication.BookStoreApplication;
import demoqa.pages.BookStoreApplication.Login;
import demoqa.pages.Elements.*;
import demoqa.pages.Forms.Forms;
import demoqa.pages.HomePage.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import javax.swing.*;
import java.time.Duration;

public class BasePage {
    public final String url = "https://demoqa.com/";
    public WebDriverManager manager;
    public WebDriver driver;
    public WebDriverWait wait;
    public Action action;
    public HomePage homePage;
    public BookStoreApplication bookStoreApplication;
    public Elements elements;
    public Forms forms;
    public TextBox textBox;
    public CheckBox checkBox;
    public Login login;
    public Links links;
    public BookStore bookStore;
    public DynamicProperties dynamicProperties;
    public BrokenLinksImages brokenLinksImages;
    public Buttons buttons;
    public RadioButton radioButton;


    @BeforeClass
    public void beforeClass() {
        manager = new ChromeDriverManager();
        manager.setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage = new HomePage(driver, wait);
        elements = new Elements(driver, wait);
        textBox = new TextBox(driver, wait);
        checkBox = new CheckBox(driver, wait);
        forms = new Forms(driver, wait);
        bookStoreApplication = new BookStoreApplication(driver, wait, action);
        login = new Login(driver, wait, action);
        links = new Links(driver, wait);
        bookStore = new BookStore(driver, wait);
        dynamicProperties = new DynamicProperties(driver, wait);
        brokenLinksImages = new BrokenLinksImages(driver, wait);
        buttons = new Buttons(driver, wait);
        radioButton = new RadioButton (driver, wait);


    }
    public void waitTime() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
    }

   /* @AfterClass
    public void afterClass() {
        homePage = null;
        wait = null;
        waitTime();
        driver.quit();
        driver = null;
        manager = null;
    }*/
}

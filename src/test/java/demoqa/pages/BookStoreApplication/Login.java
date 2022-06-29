package demoqa.pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class Login {
    public final String urlLogin = "https://demoqa.com/login";
    public final String urlRegister = "https://demoqa.com/register";

    public Action action;
    public WebDriver driver;
    public WebDriverWait wait;
    By header = By.className("main-header");
    By loginButton = By.id("login");
    By welcomeText = By.xpath("//*[contains(@style,\"margin-bottom: 50px;\")]");
    By userName = By.id("userName");
    By password = By.id("password");
    By newUserButton = By.id("newUser");
    By registerText = By.xpath("//*[contains(text(),\"Register to Book Store\")]");
    By firstName = By.id("firstname");
    By lastName = By.id("lastname");
    By registerButton = By.id("register");
    By backToLoginButton = By.id("gotologin");
    //By backToLoginButton = By.cssSelector("#gotologin");
    By captchaFrame = By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]");
    By clickCaptcha = By.cssSelector("div.recaptcha-checkbox-checkmark");
    By newUserForm = By.id("userForm");
    By messageCaptcha = By.cssSelector("#name");
    By logoutButton = By.id("submit");
    public Login(WebDriver driver, WebDriverWait wait, Action action) {
        this.driver = driver;
        this.wait = wait;
        this.action = action;
    }
    public String getWelcomeText() {
        return driver.findElement(welcomeText).getText();
    }
    public WebElement getUserName() {
        return driver.findElement(userName);
    }
    public String getLoginUrl() {
        return driver.getCurrentUrl();
    }
    public WebElement getPassword() {
        return driver.findElement(password);
    }
    public WebElement getNewUserButton() {
        return driver.findElement(newUserButton);
    }
    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }
    public WebElement getRegisterText() {
        return driver.findElement(registerText);
    }
    public WebElement getFirstName() {
        return driver.findElement(firstName);
    }
    public WebElement getLastName() {
        return driver.findElement(lastName);
    }
    public WebElement getBackToLoginButton() {
        return driver.findElement(backToLoginButton);
    }
    public WebElement getCaptchaFrame() {
        return driver.findElement(captchaFrame);
    }
    public WebElement getClickCaptcha() {
        return driver.findElement(clickCaptcha);
    }
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
    }
    public void addUserName(String name) {
        getUserName().sendKeys(name);
    }
    public void addPassword (String pw) {
        getPassword().sendKeys(pw);
    }
    public void registerButtonClick() {
        driver.findElement(registerButton).click();
    }
    public void loginButtonClick() {
        driver.findElement(loginButton).click();
    }
    public String getMessageCaptcha() {
        return driver.findElement(messageCaptcha).getText();
    }
    public void backToLoginButtonClick(){
        driver.findElement(backToLoginButton).click();
    }
    public void newUserButtonClick() {
        getNewUserButton().click();
    }
    public String getHeaderText(){
        return driver.findElement(header).getText();
    }
    public String firstNameInput = "Aleksandar";
    public String lastNameInput = "Malovic";
    public String userNameInput = "Automation";
    public String passwordInput = "Junior";
    public void enterFirstName() {
        driver.findElement(firstName).sendKeys(firstNameInput);
    }
    public void enterLastName() {
        driver.findElement(lastName).sendKeys(lastNameInput);
    }
    public void enterUserName() {
        driver.findElement(userName).sendKeys(userNameInput);
    }
    public void enterPassword() {
        driver.findElement(password).sendKeys(passwordInput);
    }
    public String validUserName = "Automation";
    public String validPassword = "Junior2022!";
    public void enterValidUserName() {
        driver.findElement(userName).sendKeys(validUserName);
    }
    public void enterValidPassword() {
        driver.findElement(password).sendKeys(validPassword);
    }
    public void logoutButtonClick() {
        driver.findElement(logoutButton).click();
    }
}
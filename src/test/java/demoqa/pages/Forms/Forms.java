package demoqa.pages.Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Locale;

public class Forms {
    public final String url = "https://demoqa.com/forms";
    public WebDriver driver;
    public WebDriverWait wait;
    By practiceForm = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]");
    By firstNameField = By.id("firstName");
    By lastNameField = By.id("lastName");
    By emailField = By.id("userEmail");
    By mobilePhone = By.id("userNumber");
    By subjectField = By.id("subjectsInput");
    By currentAddress = By.id("currentAddress");
    By genderButton = By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper:nth-child(2) form:nth-child(2) div.mt-2.row:nth-child(3) > div.col-md-9.col-sm-12");
    By birthDate = By.id("dateOfBirthInput");
    By submitButton = By.id("submit");
    By hobbies = By.xpath("//*[contains(@class,\"custom-checkbox\")]");
    By hobbies1 = By.cssSelector("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(1)");
    By hobbies2 = By.cssSelector("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(2)");
    By hobbies3 = By.cssSelector("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(3)");
    By selectState = By.cssSelector(".css-19bqh2r");
    By selectCity = By.id("city");
    By picture = By.id("uploadPicture");
    By responseTitle = By.xpath("//*[text()=\"Thanks for submitting the form\"]");
    By assertionList = By.xpath("//td[2]");
    By close = By.id("closeLargeModal");

    public Forms (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public WebElement getPracticeForm(){
        return driver.findElement(practiceForm);
    }
    public WebElement getFirstName(){
        return driver.findElement(firstNameField);
    }
    public WebElement getLastName(){
        return driver.findElement(lastNameField);
    }
    public WebElement getEmail(){
        return driver.findElement(emailField);
    }
    public WebElement getMobile(){
        return driver.findElement(mobilePhone);
    }
    public WebElement getSubject(){
        return driver.findElement(subjectField);
    }
    public WebElement getAddress(){
        return driver.findElement(currentAddress);
    }
    public WebElement getGender(){
        return driver.findElement(genderButton);
    }
    public void addHobbie(String hobbie){
        hobbie = hobbie.toLowerCase();
        switch (hobbie){
            case ("sports") -> driver.findElement(hobbies1).click();
            case ("reading") -> driver.findElement(hobbies2).click();
            case ("music") -> driver.findElement(hobbies3).click();
        }
    }
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
    }

    public void goToPracticeForm(){
        //scrollDown();
        getPracticeForm().click();
    }
    public final String firstName = "Aleksandar";
    public final String lastName = "Malovic";
    public final String eMail = "demoqa.automation@gmail.com";
    public final String mobile = "0641234567";
    public final String subject = "Maths";
    public final String address = "Automation";

    public void addFirstName(){
        getFirstName().sendKeys(firstName);
    }
    public void addLastName(){
        getLastName().sendKeys(lastName);
    }
    public void addEmail(){
        getEmail().sendKeys(eMail);
    }
    public void addMobile(){
        getMobile().sendKeys(mobile);
    }
    public void addSubject(){
        getSubject().sendKeys(subject);
    }
    public void addAddress(){
        getAddress().sendKeys(address);
    }

    public void addGender(String gender){
        gender = gender.toLowerCase();
        switch (gender) {
            case ("male") -> driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1)")).click();
            case ("female") -> driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(2)")).click();
            case ("other") -> driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(3)")).click();
        }

    }
    /*public void addCity(String s){
        Actions action = new Actions(driver);
        action.click()
    }*/



}

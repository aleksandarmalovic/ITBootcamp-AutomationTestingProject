package demoqa.tests.BookStore;

import demoqa.tests.BasePageTest.BasePageTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BasePageTest {

    @Test
    public void testLoginPages() throws InterruptedException {
        homePage.goToBookStoreApplication();
        Assert.assertEquals(bookStoreApplication.getUrl(), bookStoreApplication.url);
        Assert.assertEquals(bookStoreApplication.getHeaderText(), "Book Store");

        bookStoreApplication.scrollDown();
        bookStoreApplication.goToLogin();
        Assert.assertEquals(login.getLoginUrl(), login.urlLogin);
        Assert.assertEquals(bookStoreApplication.getHeaderText(), "Login");
        Assert.assertEquals(bookStoreApplication.getMessage(), "Welcome," + "\n" + "Login in Book Store");

        login.newUserButtonClick();
        Thread.sleep(500);
        Assert.assertEquals(bookStoreApplication.getUrl(), login.urlRegister);
        Assert.assertEquals(bookStoreApplication.getHeaderText(), "Register");
        Assert.assertEquals(bookStoreApplication.getMessage(), "Register to Book Store");

        login.enterFirstName();
        login.enterLastName();
        login.enterUserName();
        login.enterPassword();
        login.scrollDown();
        login.registerButtonClick();
        Assert.assertEquals(login.getMessageCaptcha(), "Please verify reCaptcha to register!");
        Thread.sleep(500);
        login.scrollDown();
        login.backToLoginButtonClick();
        Assert.assertEquals(bookStoreApplication.getUrl(), login.urlLogin);

    }

    @Test
    public void LoginLogoutTest() throws InterruptedException {
        homePage.goToBookStoreApplication();
        bookStoreApplication.scrollDown();
        bookStoreApplication.goToLogin();
        login.enterValidUserName();
        login.enterValidPassword();
        login.loginButtonClick();
        Thread.sleep(500);

        Assert.assertEquals(bookStoreApplication.getUrl(), "https://demoqa.com/profile");
        Assert.assertEquals(bookStoreApplication.getHeaderText(), "Profile");

        login.logoutButtonClick();

        Assert.assertEquals(login.getLoginUrl(), login.urlLogin);
        Assert.assertEquals(bookStoreApplication.getHeaderText(), "Login");
        Assert.assertEquals(bookStoreApplication.getMessage(), "Welcome," + "\n" + "Login in Book Store");
    }

    @Test
    public void LoginTest() throws InterruptedException {
        homePage.goToBookStoreApplication();
        bookStoreApplication.scrollDown();
        bookStoreApplication.goToLogin();
        login.enterValidUserName();
        login.enterValidPassword();
        login.loginButtonClick();
        Thread.sleep(500);

        Assert.assertEquals(bookStoreApplication.getUrl(), "https://demoqa.com/profile");
        Assert.assertEquals(bookStoreApplication.getHeaderText(), "Profile");
    }

    @Test
    public void LogoutTest() throws InterruptedException {
        LoginTest();
        login.logoutButtonClick();

        Assert.assertEquals(login.getLoginUrl(), login.urlLogin);
        Assert.assertEquals(bookStoreApplication.getHeaderText(), "Login");
        Assert.assertEquals(bookStoreApplication.getMessage(), "Welcome," + "\n" + "Login in Book Store");
    }
}

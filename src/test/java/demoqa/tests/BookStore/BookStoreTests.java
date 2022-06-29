package demoqa.tests.BookStore;

import demoqa.tests.BasePageTest.BasePageTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookStoreTests extends BasePageTest {
    @Test
    public void test1() throws InterruptedException {
        homePage.goToBookStoreApplication();
        Assert.assertEquals(bookStoreApplication.getUrl(), bookStoreApplication.url);
        Assert.assertEquals(bookStoreApplication.getHeaderText(), "Book Store");

        bookStoreApplication.scrollDown();
        bookStoreApplication.scrollDown();
        Thread.sleep(1000);
        bookStoreApplication.goToBookStore();
        Assert.assertEquals(bookStoreApplication.getUrl(), bookStoreApplication.url);
        Assert.assertEquals(bookStoreApplication.getHeaderText(), "Book Store");

        bookStore.clickBook(7);
    }
}

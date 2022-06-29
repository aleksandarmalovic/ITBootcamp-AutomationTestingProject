package demoqa.tests.ElementsTests;

import demoqa.tests.BasePageTest.BasePageTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksTests extends BasePageTest {
    @Test
    public void test1() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/links");
        Thread.sleep(500);

        links.linksListClick(1);
        links.switchToTab(1);
        Assert.assertEquals(links.currentUrl(), "https://demoqa.com/");

        links.switchToTab(0);
        Assert.assertEquals(links.currentUrl(), "https://demoqa.com/links");
        Assert.assertEquals(links.getHeaderText(), "Links");
    }

}

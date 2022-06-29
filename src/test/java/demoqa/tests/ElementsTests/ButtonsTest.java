package demoqa.tests.ElementsTests;

import demoqa.tests.BasePageTest.BasePageTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BasePageTest {
    @Test
    public void Buttons() throws InterruptedException {
        homePage.goToElements();
        elements.goToButtons();
        /*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(100);
        wait.until(ExpectedConditions.visibilityOf(buttons.getDoubleClickButton()));
        buttons.doDoubleClick();
        buttons.sGetDoubleClickMessage();
        Assert.assertEquals(buttons.sGetDoubleClickMessage(), "You have done a double click");

        buttons.doRightClick();
        Assert.assertEquals(buttons.sGetRightClickMessage(), "You have done a right click");

        Thread.sleep(1000);*/
        buttons.dynamicClick();
        System.out.println(driver.findElements(By.tagName("p")).get(0).getText());
        Assert.assertEquals(buttons.sGetDynamicClickMessage(), "You have done a dynamic click");
    }

    @Test
    public void test2() {
        homePage.goToElements();
        elements.goToButtons();
        buttons.dynamicClick();
        Assert.assertEquals(buttons.getDynamicMsg().getText(), "You have done a dynamic click");
        Assert.assertEquals(buttons.sGetDynamicClickMessage(), "You have done a dynamic click");
    }
}

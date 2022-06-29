package demoqa.tests.ElementsTests;

import demoqa.tests.BasePageTest.BasePageTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class DynamicPropertiesTest extends BasePageTest {

    @Test
    public void TestVisibleAfterClick() throws InterruptedException {
        homePage.goToElements();
        dynamicProperties.scrollDown();
        elements.goToDynamic();
        wait.until(ExpectedConditions.presenceOfElementLocated(dynamicProperties.visibleAfter));
        Assert.assertTrue(dynamicProperties.booleanClickVisibleAfter());

    }

    @Test
    public void TestVisibleAfter4secClick() throws InterruptedException {
        homePage.goToElements();
        dynamicProperties.scrollDown();
        elements.goToDynamic();
        Thread.sleep(2000);
        dynamicProperties.va();
        if (dynamicProperties.va().size() != 0) {
            fail();
        }
        Thread.sleep(4000);
        if (dynamicProperties.va().size() ==0 ){
            fail();
        }
    }

    @Test
    public void TestEnableAfterClick() {
        homePage.goToElements();
        dynamicProperties.scrollDown();
        elements.goToDynamic();
        wait.until(ExpectedConditions.presenceOfElementLocated(dynamicProperties.enableAfter));
        Assert.assertTrue(dynamicProperties.booleanClickEnableAfter());
    }

    @Test
    public void TestEnableAfter4secClick() throws InterruptedException {
        homePage.goToElements();
        dynamicProperties.scrollDown();
        elements.goToDynamic();
        Thread.sleep(4000);
        Assert.assertFalse(dynamicProperties.enableAfterIsEnable());

    }
}

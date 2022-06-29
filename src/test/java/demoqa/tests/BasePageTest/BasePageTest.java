package demoqa.tests.BasePageTest;

import demoqa.pages.BasePage.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasePageTest extends BasePage {
    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
    }

    @Test
    public void test1() throws InterruptedException {
        homePage.goToElements();
        elements.goToRadioButton();
    }
    @Test
    public void testCheckBoxExpansion() throws InterruptedException {
        homePage.goToElements();
        elements.goToCheckBox();
        checkBox.getExpandArrow().click();
        checkBox.getCheckMain().click();
        homePage.waitTime();
        /* checkBoxPage.expandHome();
        // Expands Desktop,Documents or Downloads
        checkBoxPage.expandUnderHome("Desktop");
        checkBoxPage.expandUnderHome("Documents");
        checkBoxPage.expandUnderHome("Downloads");
        // expand  for Work Space & Office under Documents
        checkBoxPage.expandUnderDocuments("WorkSpace");
        checkBoxPage.expandUnderDocuments("Office");
        waitTime();
        //collapse all =1, expands=0
        checkBoxPage.expandAndCollapseAll(1);
        waitTime();
        checkBoxPage.expandAndCollapseAll(0);

        Assert.assertEquals(methods.getTitleName(), "Check Box");

         */
    }
}

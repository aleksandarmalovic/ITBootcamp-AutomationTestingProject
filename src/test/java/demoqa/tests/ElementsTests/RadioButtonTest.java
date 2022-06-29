package demoqa.tests.ElementsTests;

import demoqa.tests.BasePageTest.BasePageTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BasePageTest {
    @Test
    public void TestButtons() {
        homePage.goToElements();
        elements.goToRadioButton();
        Assert.assertEquals(textBox.getCurrentUrl(),"https://demoqa.com/radio-button");
        Assert.assertEquals(radioButton.getHeaderText(), "Radio Button");
        radioButton.clickButton(1);
        Assert.assertEquals(radioButton.getMessage(), "Impressive");
        radioButton.clickButton(0);
        Assert.assertEquals(radioButton.getMessage(), "Yes");
    }
}

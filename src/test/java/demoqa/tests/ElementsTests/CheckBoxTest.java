package demoqa.tests.ElementsTests;

import demoqa.tests.BasePageTest.BasePageTest;
import org.testng.annotations.Test;

public class CheckBoxTest extends BasePageTest {
    @Test
    public void test1() {
        homePage.goToElements();
        elements.goToCheckBox();
    }
}

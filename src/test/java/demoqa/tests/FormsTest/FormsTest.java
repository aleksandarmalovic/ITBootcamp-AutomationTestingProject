package demoqa.tests.FormsTest;

import demoqa.tests.BasePageTest.BasePageTest;
import org.testng.annotations.Test;

public class FormsTest extends BasePageTest{

    @Test
    public void test1() throws InterruptedException {
        homePage.goToForms();
        forms.goToPracticeForm();
        forms.addFirstName();
        forms.addLastName();
        forms.addEmail();
        forms.addMobile();
        forms.addSubject();
        forms.addAddress();
        forms.addGender("female");
        forms.addHobbie("sports");

    }
}

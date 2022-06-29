package demoqa.tests.ElementsTests;

import demoqa.tests.BasePageTest.BasePageTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTests extends BasePageTest {

    @Test
    public void Tests() throws InterruptedException {
        homePage.goToElements();
        elements.goToTextBox();

        //Provera trenutnog url-a:
        Assert.assertEquals(textBox.getCurrentUrl(),"https://demoqa.com/text-box");

        //Provera teksta u hederu:
        Assert.assertEquals(textBox.getHeaderText(), "Text Box");

        textBox.addFullName(textBox.sFullName);
        textBox.addEmail(textBox.sEmail);
        textBox.addCurAddress(textBox.sCurAddress);
        textBox.addPerAddress(textBox.sPerAddress);
        textBox.submit();
        System.out.println(textBox.getCurrentText());

        //Provera ispisa unetih podataka:
        Assert.assertEquals(textBox.getCurrentText(),"Name:"+textBox.sFullName+"\n"
                                                            +"Email:"+textBox.sEmail+"\n"
                                                            +"Current Address :"+textBox.sCurAddress+"\n"
                                                            +"Permananet Address :"+textBox.sPerAddress);
    }

}

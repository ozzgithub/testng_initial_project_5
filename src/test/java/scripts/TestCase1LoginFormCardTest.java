package scripts;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontEndPage;
import pages.TechGlobalLoginFormPage;
import utils.Waiter;

public class TestCase1LoginFormCardTest extends TechGlobalBase {

    @BeforeMethod
    public void setPage() {
        techGlobalFrontEndPage = new TechGlobalFrontEndPage();
        techGlobalLoginFormPage = new TechGlobalLoginFormPage();
    }

    @Test(description = "Validate TechGlobal Login Form card")
    public void validationLoginFormCard() {

        techGlobalFrontEndPage.getFrontendTestingPage();
        techGlobalFrontEndPage.clickOnCard(15);
        Waiter.pause(5);

        Assert.assertTrue(techGlobalLoginFormPage.heading1.isDisplayed());

        for (int i = 0; i < techGlobalLoginFormPage.formLabelForUserNameAndPassword.size(); i++) {

            Assert.assertTrue(techGlobalLoginFormPage.formLabelForUserNameAndPassword.get(i).isDisplayed());
        }

        for (int i = 0; i < techGlobalLoginFormPage.formInputBoxForUserNameAndPassword.size(); i++) {

            Assert.assertTrue(techGlobalLoginFormPage.formInputBoxForUserNameAndPassword.get(i).isDisplayed());


        }




    }
}

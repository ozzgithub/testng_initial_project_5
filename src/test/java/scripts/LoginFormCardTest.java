package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontEndPage;
import pages.TechGlobalLoginFormPage;
import utils.Waiter;

public class LoginFormCardTest extends TechGlobalBase {


    @Test(priority = 1, description = "Validate TechGlobal Login Form card")
    public void validationLoginFormCard() {

        techGlobalFrontEndPage.getFrontendTestingPage();
        techGlobalFrontEndPage.clickOnCard(15);
        Waiter.pause(3);

        Assert.assertTrue(techGlobalLoginFormPage.heading1.isDisplayed());

        for (int i = 0; i < techGlobalLoginFormPage.formLabelForUserNameAndPassword.size(); i++) {

            Assert.assertTrue(techGlobalLoginFormPage.formLabelForUserNameAndPassword.get(i).isDisplayed());
        }

        Waiter.pause(3);

        for (int i = 0; i < techGlobalLoginFormPage.formInputBoxForUserNameAndPassword.size(); i++) {

            Assert.assertTrue(techGlobalLoginFormPage.formInputBoxForUserNameAndPassword.get(i).isDisplayed());

        }

        Assert.assertTrue(techGlobalLoginFormPage.loginButton.isDisplayed());
        Assert.assertTrue(techGlobalLoginFormPage.forgotPasswordLink.isDisplayed());

    }








}

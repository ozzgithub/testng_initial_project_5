package scripts;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontEndPage;
import pages.TechGlobalLoginFormPage;
import utils.Waiter;

public class TechGlobalLinkAndResetLink extends TechGlobalBase{


    @Test(priority = 1, description = "Validate TechGlobal Login Form card Forgot Password Link and Reset Password page")
    public void linkAndResetPage() {

        techGlobalLoginFormPage.forgotPasswordLink.click();
        Waiter.pause(2);

        Assert.assertTrue(techGlobalLoginFormPage.resetPasswordHeading1.isDisplayed());
        Assert.assertTrue(techGlobalLoginFormPage.enterEmailAddressMessage.isDisplayed());
        Assert.assertTrue(techGlobalLoginFormPage.emailInputBox.isDisplayed());
        Assert.assertTrue(techGlobalLoginFormPage.submitButton.isDisplayed());

    }



    @Test(priority = 2, description = "Validate TechGlobal Login Form card Reset Password link")
    public void resetPasswordLink() {

        techGlobalLoginFormPage.forgotPasswordLink.click();
        techGlobalLoginFormPage.emailInputBox.sendKeys("johndoe@gmail.com");
        techGlobalLoginFormPage.submitButton.click();
        Assert.assertTrue(techGlobalLoginFormPage.confirmationMessage.isDisplayed());
        Assert.assertEquals(techGlobalLoginFormPage.confirmationMessage.getText(), "A link to reset your password has been sent to your email address.");







    }
}

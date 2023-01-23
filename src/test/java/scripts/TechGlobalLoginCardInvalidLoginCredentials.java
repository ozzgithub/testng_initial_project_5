package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Waiter;

public class TechGlobalLoginCardInvalidLoginCredentials extends TechGlobalBase{

    @Test(priority = 1, description = "Validate TechGlobal Form card invalid login with wrong username")
    public void validateInvalidWrongUserName() {

        techGlobalLoginFormPage.getInvalidUserNameLoginFormPage();
        Assert.assertTrue(techGlobalLoginFormPage.invalidCredentialsErrorMessage.isDisplayed());
        Assert.assertEquals(techGlobalLoginFormPage.invalidCredentialsErrorMessage.getText(), "Invalid Username entered!");
        Waiter.pause(2);
    }

     @Test(priority = 2, description = "Validate TechGlobal Form card invalid login with wrong password")
     public void validateInvalidWrongPassword(){

        techGlobalLoginFormPage.getInvalidPasswordLoginFormPage();
        Assert.assertTrue(techGlobalLoginFormPage.invalidCredentialsErrorMessage.isDisplayed());
        Waiter.pause(2);
        Assert.assertEquals(techGlobalLoginFormPage.invalidCredentialsErrorMessage.getText(), "Invalid Password entered!");

   }

   @Test(priority = 3, description = "Validate TechGlobal Form card invalid login with wrong password and wrond username")
   public void validateInvalidWrongPasswordAndUserName() {

        techGlobalLoginFormPage.getInvalidPasswordAndUserNameLoginFormPage();
        Assert.assertTrue(techGlobalLoginFormPage.invalidCredentialsErrorMessage.isDisplayed());
        Assert.assertEquals(techGlobalLoginFormPage.invalidCredentialsErrorMessage.getText(), "Invalid Username entered!");
   }
}

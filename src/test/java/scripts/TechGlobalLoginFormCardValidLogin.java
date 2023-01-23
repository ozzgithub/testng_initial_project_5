package scripts;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TechGlobalFrontEndPage;
import pages.TechGlobalLoginFormPage;
import utils.Waiter;

public class TechGlobalLoginFormCardValidLogin extends TechGlobalBase{


    @Test(priority = 1 , description = "Validate TechGlobal Login Form card valid login")
    public void loginFormValidLogin() {


        techGlobalLoginFormPage.getLoginFormPage();

        Assert.assertTrue(techGlobalLoginFormPage.afterLoggedMessage.isDisplayed());
        Assert.assertTrue(techGlobalLoginFormPage.logOutButton.isDisplayed());
    }





    @Test(priority = 2, description = "Validate TechGlobal Login From card valid login and logout")
    public void loginFormValidLoginAndLogout() {

        techGlobalLoginFormPage.getLoginFormPage();
        techGlobalLoginFormPage.logOutButton.click();

       Assert.assertEquals(driver.getCurrentUrl(), "https://techglobal-training.netlify.app/frontend/login-form");

        Waiter.pause(5);
    }





}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class TechGlobalLoginFormPage extends TechGlobalBasePage{

    public TechGlobalLoginFormPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

        @FindBy(id = "main_heading")
         public WebElement heading1;

        @FindBy(css = ".LoginForm_form__b4o6J div>label")
        public List<WebElement> formLabelForUserNameAndPassword;

        @FindBy(css = ".LoginForm_form__b4o6J div>input")
        public List<WebElement> formInputBoxForUserNameAndPassword;

        @FindBy(id = "login_btn")
        public WebElement loginButton;

        @FindBy(id = "forgot-password")
        public WebElement forgotPasswordLink;

        @FindBy(id = "success_lgn")
        public WebElement afterLoggedMessage;

        @FindBy(id = "logout")
        public WebElement logOutButton;

        @FindBy(id = "sub_heading")
        public WebElement resetPasswordHeading1;

        @FindBy(css = "div[class^='Forgot'] div>label")
        public WebElement enterEmailAddressMessage;

        @FindBy(id = "email")
        public WebElement emailInputBox;

        @FindBy(id = "submit")
        public WebElement submitButton;

        @FindBy(id = "confirmation_message")
        public WebElement confirmationMessage;

        @FindBy(id = "error_message")
        public WebElement invalidCredentialsErrorMessage;





    public void getLoginFormPage() {

           formInputBoxForUserNameAndPassword.get(0).sendKeys("TechGlobal");
           formInputBoxForUserNameAndPassword.get(1).sendKeys("Test1234");

           loginButton.click();
        }


    public void getInvalidUserNameLoginFormPage() {

        formInputBoxForUserNameAndPassword.get(0).sendKeys("john");
        formInputBoxForUserNameAndPassword.get(1).sendKeys("Test1234");

        loginButton.click();
    }

    public void getInvalidPasswordLoginFormPage() {

        formInputBoxForUserNameAndPassword.get(0).sendKeys("TechGlobal");
        formInputBoxForUserNameAndPassword.get(1).sendKeys("1234");

        loginButton.click();
    }


    public void getInvalidPasswordAndUserNameLoginFormPage() {

        formInputBoxForUserNameAndPassword.get(0).sendKeys("john");
        formInputBoxForUserNameAndPassword.get(1).sendKeys("1234");

        loginButton.click();
    }



}

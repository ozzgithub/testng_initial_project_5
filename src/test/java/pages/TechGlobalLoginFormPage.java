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

}

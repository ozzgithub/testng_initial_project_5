package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class TechGlobalFrontEndPage extends  TechGlobalBasePage {

    public TechGlobalFrontEndPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "div[id^='card'] ")
    public List<WebElement> cards;



    public void getFrontendTestingPage() {

        dropdownHeader.click();
        dropDownOptions.get(0).click();


    }



    public void clickOnCard(int index) {

        cards.get(index).click();
    }


}

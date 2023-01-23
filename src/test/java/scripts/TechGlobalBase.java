package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.TechGlobalBasePage;
import pages.TechGlobalFrontEndPage;
import pages.TechGlobalLoginFormPage;
import utils.ConfigReader;
import utils.Driver;

public class TechGlobalBase {

    WebDriver driver;
    TechGlobalBasePage techGlobalBasePage;
    TechGlobalFrontEndPage techGlobalFrontEndPage;
    TechGlobalLoginFormPage techGlobalLoginFormPage;


    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("appURL"));

        techGlobalBasePage = new TechGlobalBasePage();
        techGlobalFrontEndPage = new TechGlobalFrontEndPage();
        techGlobalLoginFormPage = new TechGlobalLoginFormPage();

        techGlobalFrontEndPage.getFrontendTestingPage();
        techGlobalFrontEndPage.clickOnCard(15);



    }





    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}

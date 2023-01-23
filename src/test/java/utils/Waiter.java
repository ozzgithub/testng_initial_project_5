package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {

    public static void pause(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }




    public static void waitForVisibilityOfElement(WebElement element, int seconds) {

        new WebDriverWait(Driver.getDriver(), seconds).until(ExpectedConditions.visibilityOf(element));
    }
}

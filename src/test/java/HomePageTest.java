import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest {
    Setup baseTest= new Setup();


    @Test(priority = 1)
    public void verifyThatSignUpModalIsClosedSuccessfully() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(HomePOM.getSignUpModalCloseButton()));
        HomePOM.getSignUpModalCloseButton().click();
    }
}

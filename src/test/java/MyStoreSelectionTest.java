import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyStoreSelectionTest {

    @Test(priority = 1)
    public void verifyThatMyStoreModalIsOpenedSuccessfully() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(HomePOM.getMyStoreButton()));
        Setup.driver.manage().deleteAllCookies();
        HomePOM.getMyStoreButton().click();
    }
    @Test(priority = 2)
    public void verifyThatStoreIsSelected() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(HomePOM.getMyStoreModalLoaded()));
        Setup.driver.manage().deleteAllCookies();
        HomePOM.getMyStoreSelectStoreButton().click();
    }
}

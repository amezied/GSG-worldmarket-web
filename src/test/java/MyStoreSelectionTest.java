import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyStoreSelectionTest {
    Setup baseTest= new Setup();


    @Test(priority = 1)
    public void verifyThatMyStoreModalIsOpenedSuccessfully() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(HomePOM.getMyStoreButton()));
        HomePOM.getMyStoreButton().click();
    }
    @Test(priority = 2)
    public void verifyThatMyStoreButtonIsSelected() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(HomePOM.getMyStoreCheckStoreButton()));
        HomePOM.getMyStoreCheckStoreButton().click();
        Setup.wait.until(ExpectedConditions.elementToBeClickable(HomePOM.getMyStoreSelectOaklandStoreButton()));
        HomePOM.getMyStoreSelectOaklandStoreButton().click();
    }
    @Test(priority = 3)
    public void verifyThatOaklandStoreIsSelected() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(HomePOM.getMyStoreButton()));
        Assert.assertEquals("Oakland", HomePOM.getMyStoreTextAfterSelect());
    }
}

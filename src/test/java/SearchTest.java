import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.Delayed;

public class SearchTest {
    @Test(priority = 1)
    public void verifyThatSearchFieldIsDisplay() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(SearchPOM.getSearchField()));
        SearchPOM.getSearchField().sendKeys(TestData.SearchData.searchText);
        Setup.driver.manage().deleteAllCookies();
        SearchPOM.getSearchButton().click();
    }
    @Test(priority = 2)
    public void verifyThatItemSelectedSuccessfully() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(SearchPOM.getSearchItemLink()));
        Setup.driver.manage().deleteAllCookies();
        SearchPOM.getSearchItem().click();
    }
}

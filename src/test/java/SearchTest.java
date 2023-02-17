import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class SearchTest {
    Setup baseTest= new Setup();


    @Test(priority = 1)
    public void verifyThatSearchFieldIsDisplay() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(SearchPOM.getSearchField()));
        SearchPOM.getSearchField().sendKeys(TestData.SearchData.searchText);
        SearchPOM.getSearchButton().click();
    }
}

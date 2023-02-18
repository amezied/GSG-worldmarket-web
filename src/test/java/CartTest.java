import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest {
    @Test(priority = 1)
    public void verifyThatAddToCartButtonIsDisplay() {
        Setup.driver.manage().deleteAllCookies();
        Setup.wait.until(ExpectedConditions.elementToBeClickable(CartPOM.getAddToCartButton()));
        Assert.assertTrue(CartPOM.getAddToCartButton().isDisplayed());
    }
    @Test(priority = 2)
    public void verifyThatIncreaseQuantitySuccessfully() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(CartPOM.getIncreaseQuantityButton()));
        CartPOM.getIncreaseQuantityButton().click();
    }
    @Test(priority = 3)
    public void verifyThatAddToCartSuccessfully() {
        CartPOM.getAddToCartButton().click();
    }
    @Test(priority = 4)
    public void verifyThatCheckoutSideButtonIsDisplay() {
        Setup.driver.manage().deleteAllCookies();
        Setup.wait.until(ExpectedConditions.elementToBeClickable(CartPOM.getCheckoutSideButton()));
        Assert.assertTrue(CartPOM.getCheckoutSideButton().isDisplayed());
    }
    @Test(priority = 5)
    public void verifyThatCheckoutSuccessfully() {
        CartPOM.getCheckoutSideButton().click();
    }
    @Test(priority = 6)
    public void verifyThatOrderCheckoutButtonIsDisplay() {
        Setup.driver.manage().deleteAllCookies();
        Setup.wait.until(ExpectedConditions.elementToBeClickable(CartPOM.getOrderCheckoutButton()));
        Assert.assertTrue(CartPOM.getOrderCheckoutButton().isDisplayed());
    }
    @Test(priority = 7)
    public void verifyThatOrderCheckoutSuccessfully() {
        CartPOM.getOrderCheckoutButton().click();
    }
}

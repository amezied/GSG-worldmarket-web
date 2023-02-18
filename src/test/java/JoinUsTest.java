import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinUsTest {
    @Test(priority = 1)
    public void verifyThatJoinUsFormIsOpenedSuccessfully() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(HomePOM.getJoinUsButton()));
        Assert.assertTrue(HomePOM.getJoinUsButton().isDisplayed());
        Setup.driver.manage().deleteAllCookies();
        HomePOM.getJoinUsButton().click();

    }
    @Test(priority = 2 ,enabled = false)
    public void verifyThatFillDataInJoinAsForm() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(JoinFormPOM.getFirstNameField()));
        JoinFormPOM.getFirstNameField().sendKeys(TestData.NewUserData.firstName);
        JoinFormPOM.getLastNameField().sendKeys(TestData.NewUserData.lastName);
        JoinFormPOM.getLoginEmailField().sendKeys(TestData.NewUserData.email);
        JoinFormPOM.getPasswordField().sendKeys(TestData.NewUserData.password);
        JoinFormPOM.getMemberIdField().sendKeys(TestData.NewUserData.memberId);
        new Select(JoinFormPOM.getBirthMonthField()).selectByValue(TestData.NewUserData.birthMonth);
        new Select(JoinFormPOM.getBirthDayField()).selectByValue(TestData.NewUserData.birthDay);
        JoinFormPOM.getEmailSubscriptionField().click();
        JoinFormPOM.getPhoneSubscriptionField().click();
        JoinFormPOM.getPostalCodeField().sendKeys(TestData.NewUserData.code);
        JoinFormPOM.getAcceptTermsAndConditionsField().click();
        JoinFormPOM.getCreateAccountButton().click();
       // Setup.wait.until(ExpectedConditions.visibilityOf(JoinFormPOM.getSuccessLabel()));
      //  Assert.assertEquals(JoinFormPOM.getSuccessLabel().getText(), TestData.NewUserData.successMessage);
    }
    @Test(priority = 3)
    public void verifyThatFillDataInJoinAsFormWithInvalidEmail() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(JoinFormPOM.getFirstNameField()));
        JoinFormPOM.getFirstNameField().sendKeys(TestData.NewInvalidUserData.firstName);
        JoinFormPOM.getLastNameField().sendKeys(TestData.NewInvalidUserData.lastName);
        JoinFormPOM.getLoginEmailField().sendKeys(TestData.NewInvalidUserData.email);
        JoinFormPOM.getPasswordField().sendKeys(TestData.NewInvalidUserData.password);
        JoinFormPOM.getMemberIdField().sendKeys(TestData.NewInvalidUserData.memberId);
        new Select(JoinFormPOM.getBirthMonthField()).selectByValue(TestData.NewInvalidUserData.birthMonth);
        new Select(JoinFormPOM.getBirthDayField()).selectByValue(TestData.NewInvalidUserData.birthDay);
        JoinFormPOM.getEmailSubscriptionField().click();
        JoinFormPOM.getPhoneSubscriptionField().click();
        JoinFormPOM.getPostalCodeField().sendKeys(TestData.NewInvalidUserData.code);
        JoinFormPOM.getAcceptTermsAndConditionsField().click();
        JoinFormPOM.getCreateAccountButton().click();
        Assert.assertEquals(JoinFormPOM.getEmailValidationData().getText(), TestData.NewInvalidUserData.emailValidationMessage);
    }
}

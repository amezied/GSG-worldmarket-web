import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JoinFormPOM {

    public static WebElement getCreateAccountForm(){
      return  Setup.driver.findElement(By.id("createAccountForm"));
    }
    public static WebElement getFirstNameField(){
      return  Setup.driver.findElement(By.id("create_firstName"));
    }
    public static WebElement getLastNameField(){
      return  Setup.driver.findElement(By.id("create_lastName"));
    }
    public static WebElement getLoginEmailField(){
      return  Setup.driver.findElement(By.id("loginEmailCreateAccount"));
    }
    public static WebElement getPasswordField(){
      return  Setup.driver.findElement(By.id("userPasswordCreate"));
    }
    public static WebElement getMemberIdField(){
      return  Setup.driver.findElement(By.id("memberIdInputCreateAccount"));
    }
    public static WebElement getBirthMonthField(){
      return  Setup.driver.findElement(By.id("birthdayMonth"));
    }
    public static WebElement getBirthDayField(){
      return  Setup.driver.findElement(By.id("birthdayDay"));
    }
    public static WebElement getEmailSubscriptionField(){
        return  Setup.driver.findElement(By.id("createAccountEmailSubscriptionRequired"));
    }
    public static WebElement getPhoneSubscriptionField(){
      return  Setup.driver.findElement(By.id("createAccountPhoneSubscriptionRequired"));
    }
    public static WebElement getPostalCodeField(){
        return  Setup.driver.findElement(By.id("postalCodeCreate"));
    }
    public static WebElement getAcceptTermsAndConditionsField(){
      return  Setup.driver.findElement(By.id("createAccountTandC"));
    }
    public static WebElement getCreateAccountButton(){
      return  Setup.driver.findElement(By.id("createAccountButton"));
    }

}

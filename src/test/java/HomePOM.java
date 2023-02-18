import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePOM {
    public static WebElement getJoinUsButton(){
        return Setup.driver.findElementById("gpsnonjoin");
    }
    public static WebElement getSignUpModalCloseButton(){
        return Setup.driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
    }
    public static WebElement getMyStoreButton(){
        return Setup.driver.findElementById("selectStoreDialogLink");
    }
    public static WebElement getMyStoreModalLoaded(){
        return Setup.driver.findElementById("storesSearchResultData");
    }
    public static WebElement getMyStoreSelectStoreButton(){
        return Setup.driver.findElementById("changePickupStoreButton_"+TestData.MyStoreData.storeSelectBtnId);
    }

}

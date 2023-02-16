import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePOM {
    public static WebElement getJoinUsButton(){
        return Setup.driver.findElement(By.xpath("//*[@id='gpsnonjoin']"));
    }
    public static WebElement getSignUpModalCloseButton(){
        return Setup.driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
    }
    public static WebElement getMyStoreButton(){
        return Setup.driver.findElement(By.id("thStore"));
    }
    public static WebElement getMyStore(){
        return Setup.driver.findElementById("myStoreLoc");
    }
    public static WebElement getMyStoreCheckStoreButton(){
        return Setup.driver.findElementById("changeStore");
    }
    public static WebElement getMyStoreSelectOaklandStoreButton(){
        return Setup.driver.findElementById("changePickupStoreButton_19");
    }
    public static String getMyStoreTextAfterSelect(){
        return Setup.driver.findElementById("myStoreLoc").getText();
    }

}

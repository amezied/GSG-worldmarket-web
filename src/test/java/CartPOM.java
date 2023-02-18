import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPOM {
    public static WebElement getAddToCartButton(){
        return Setup.driver.findElement(By.xpath("//div[@id='enabledaddtobasket']"));
    }
    public static WebElement getIncreaseQuantityButton(){
        return Setup.driver.findElement(By.xpath("//*[@id='mainForm']//span[contains(@class,'icon-plus')]/parent::*"));
    }
    public static WebElement getCheckoutSideButton(){
        return Setup.driver.findElement(By.xpath("//button[@name='Checkout']"));
    }
    public static WebElement getOrderCheckoutButton(){
        return Setup.driver.findElement(By.xpath("//*[contains(@class,'basket-buttons')]//button"));
                //"/html/body/div[2]/main/div[3]/div/div/div[1]/form/div[2]/div[1]/div[2]/div[2]/div/div/div[1]/button"));
    }
}

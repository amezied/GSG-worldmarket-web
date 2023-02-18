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
        return Setup.driver.findElement(By.xpath("//*[contains(@class,'basket-buttons')]//button/parent::*"));
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPOM {
    public static WebElement getSearchField(){
        return Setup.driver.findElementById("navsearchbox");
    }
    public static WebElement getSearchButton(){
        return Setup.driver.findElementById("searchBtn");
    }
    public static WebElement getSearchItem(){
        return Setup.driver.findElement(By.xpath("//a[@href='"+TestData.AddToCartData.itemLink+"']/parent::*"));
    }
    public static WebElement getSearchItemLink(){
        return Setup.driver.findElement(By.xpath("//a[@href='"+TestData.AddToCartData.itemLink+"']"));
    }
}

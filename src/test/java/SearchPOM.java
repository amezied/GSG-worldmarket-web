import org.openqa.selenium.WebElement;

public class SearchPOM {
    public static WebElement getSearchField(){
        return Setup.driver.findElementById("navsearchbox");
    }
    public static WebElement getSearchButton(){
        return Setup.driver.findElementById("searchBtn");
    }
}

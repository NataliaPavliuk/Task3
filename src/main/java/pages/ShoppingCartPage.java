package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ShoppingCartPage extends BasePage{
    @FindBy(xpath = " //div[@class='cart-receipt__sum-price']")
    private WebElement price;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public int getPrice(){
        return Integer.parseInt(price.getText()) ;
    }
}

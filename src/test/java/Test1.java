import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class Test1 extends BaseTest{

    private static final long DEFAULT_WAITING_TIME = 90;
    WebDriver driver;

    @Test
    public void checkBasketList(){
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().isSearchFieldVisible();
        getHomePage().enterTextToSearchField("laptop");
        getSearchResultsPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getSearchResultsPage().searchBrend("HP");
        getSearchResultsPage().takeCheckBox();
        getSearchResultsPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getSearchResultsPage().takeExpensiveItem();
        getSearchResultsPage().clickCartButtonOnFirstProduct();
        getHomePage().clickHeaderCartButton();
        getHomePage().moveToNextWindow();
        getShoppingCartPage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        Assert.assertTrue(getShoppingCartPage().getPrice()>200000);

    }
}

package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage{
    @FindBy(xpath = "//input[@class='sidebar-search__input ng-untouched ng-pristine ng-valid']")
    private List<WebElement> searchFieldList;

    @FindBy(xpath = "//a[@data-id='HP']")
    private WebElement checkboxHP;

    @FindBy(xpath = "//option[contains(@value, 'expensive')]")
    private WebElement expensiveItem;

    @FindBy(xpath = " //button[contains(@class, 'buy-button goods-tile__buy-button')]")
    private List<WebElement> cartButtons;


    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickCartButtonOnFirstProduct() {
       cartButtons.get(1).click();
   }

    public void takeExpensiveItem(){expensiveItem.click();}

    public void takeCheckBox(){checkboxHP.click();}
    public void searchBrend(final String searchText) {
        searchFieldList.get(1).clear();
        searchFieldList.get(1).sendKeys(searchText, Keys.ENTER);;
    }
    }


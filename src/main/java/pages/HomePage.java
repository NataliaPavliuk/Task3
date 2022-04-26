package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[contains(@class, 'search-form__input')]")
    private WebElement searchField;

    @FindBy(xpath = " //button[contains(@class, 'header__button ng-star-inserted header__button--active')]")
    private WebElement headerCartButton;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isSearchFieldVisible() {
        return searchField.isDisplayed();
    }

    public void enterTextToSearchField(final String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText, Keys.ENTER);
    }

    public void clickHeaderCartButton(){
        headerCartButton.click();
    }

    String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
    @FindBy (xpath=("html/body/header/div/div[1]/nav/a"))
    private WebElement e;



    public void moveToNextWindow(){
        e.sendKeys(selectLinkOpeninNewTab);
        e.sendKeys(Keys.CONTROL + "\t");//to move focus to next tab in same browser
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }
}

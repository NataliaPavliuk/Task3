import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pages.HomePage;
import pages.SearchResultPage;
import pages.ShoppingCartPage;



public class BaseTest {

    private static final String ROZETKA_URL = "https://rozetka.com.ua";
    WebDriver driver;

    @BeforeTest
    void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterTest
    void teardown() {
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }


    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SearchResultPage getSearchResultsPage() {
        return new SearchResultPage(getDriver());
    }

    public ShoppingCartPage getShoppingCartPage() {
        return new ShoppingCartPage(getDriver());
    }

}
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class BasePageTest {

    public WebDriver driver;

    @BeforeEach
    public void setUp(){

        driver = Core.Driver.initialize();
        driver.manage().window().maximize();
    }

//    @Test
    public void AddProductToCart(){
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage()
                .goToLoginPage()
                .loginOnSite("jonjones@gmail.com", "123456")
                .goToHomePageFromUserAccount()
                .accessCategoryList()
                .accessCategoryPage()
                .accessProductPage()
                .addProductToCart("2")
                .goToCart()
                .showAsserts();
    }

//    @Test
    public void AddAndDeleteProductFromCart(){
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage()
                .goToLoginPage()
                .loginOnSite("jonjones@gmail.com", "123456")
                .goToHomePageFromUserAccount()
                .accessCategoryList()
                .accessCategoryPage()
                .accessProductPage()
                .addProductToCart("2")
                .goToCart()
                .showAsserts()
                .removeProductFromCart()
                .showAsserts();
    }

    @Test
    public void AddMultipleDeleteOne(){
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage()
                .goToLoginPage()
                .loginOnSite("jonjones@gmail.com", "123456")
                .goToHomePageFromUserAccount()
                .accessCategoryList()
                .accessCategoryPage()
                .accessProductPage()
                .addProductToCart("2")
                .accessCategoryList()
                .accessSecondCategoryPage()
                .accessProductIPod()
                .addProductToCart("3")
                .goToCart()
                .showAsserts()
                .removeSecondProduct()
                .showAssertsAfterRemoving();
    }


    @AfterEach
    public void tearDown () {
        driver.quit();
    }

}
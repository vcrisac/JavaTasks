import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    String baseURL = "http://172.23.176.168/";

    private By myAccountDropDown = By.xpath("//span[contains(text(),'My Account')]");
    private By loginPageOption = By.xpath("//a[contains(text(),'Login')]");
    private By categoryList = By.xpath("//a[contains(text(),'Desktops')]");

    public HomePage goToHomePage(){
        driver.get(baseURL);
        return this;
    }

    public LoginPage goToLoginPage(){
        click(myAccountDropDown);
        click(loginPageOption);
        return new LoginPage(driver);
    }

    public CaterogyList accessCategoryList() {
        click(categoryList);
        return new CaterogyList(driver);
    }





}

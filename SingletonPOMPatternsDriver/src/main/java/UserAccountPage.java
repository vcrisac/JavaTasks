import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserAccountPage extends BasePage {
    public UserAccountPage(WebDriver driver) {
        super(driver);
    }

    By homePage = By.xpath("//i[@class='fa fa-home']");

    public HomePage goToHomePageFromUserAccount(){
        click(homePage);
        return new HomePage(driver);
    }
}

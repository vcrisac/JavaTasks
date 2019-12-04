import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By inputEmailField = By.xpath("//input[@id='input-email']");
    By inputPasswordField = By.xpath("//input[@id='input-password']");
    By loginButton = By.xpath("//input[@class='btn btn-primary']");

    public UserAccountPage loginOnSite(String email, String password){
        writeText(inputEmailField, email);
        writeText(inputPasswordField, password);
        click(loginButton);
        return new UserAccountPage(driver);
    }



}

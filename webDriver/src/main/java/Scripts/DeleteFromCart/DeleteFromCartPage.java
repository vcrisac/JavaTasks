package Scripts.DeleteFromCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteFromCartPage {
    WebDriver webDriver;
    public DeleteFromCartPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccount;
    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement loginOption;
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement inputEmailField;
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement inputPasswordField;
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement loginButton;
    @FindBy(xpath = "//i[@class='fa fa-home']")
    WebElement homePage;
    @FindBy(xpath = "//a[contains(text(),'Phones & PDAs')]")
    WebElement accessCategory;
    @FindBy(xpath = "//body//div[@class='row']//div[@class='row']//div[2]//div[1]//div[1]//a[1]//img[1]")
    WebElement accessProduct;
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement inputQuantity;
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCartButton;
    @FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
    WebElement shoppingCartLink;
    @FindBy(xpath = "//i[@class='fa fa-times-circle']")
    WebElement removeFromCart;
    @FindBy(xpath = "//h2[contains(text(),'What would you like to do next?')]")
    WebElement assertFalseCartNotEmpty;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement assertTrueEmptyCart;

}

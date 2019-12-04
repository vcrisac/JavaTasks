import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private By inputQuantity = By.xpath("//input[@id='input-quantity']");
    private By addToCartButton = By.xpath("//button[@id='button-cart']");
    private By goToCartLink = By.xpath("//span[contains(text(),'Shopping Cart')]");
    private By accessCategoryList = By.xpath("//a[contains(text(),'Desktops')]");

    public ProductPage addProductToCart(String quantity){
        writeText(inputQuantity, quantity);
        click(addToCartButton);
        return this;
    }

    public CartPage goToCart(){
        click(goToCartLink);
        return new CartPage(driver);
    }

    public CaterogyList accessCategoryList(){
        click(accessCategoryList);
        return new CaterogyList(driver);
    }


}

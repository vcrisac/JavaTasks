import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    By assertTrueCartNotEmpty = By.xpath("//h2[contains(text(),'What would you like to do next?')]");
    By assertFalseCartIsEmpty = By.xpath("//a[@class='btn btn-primary']");
    By removeProduct = By.xpath("//i[@class='fa fa-times-circle']");
    By removeSecondProduct = By.xpath("//tr[1]//td[4]//div[1]//span[1]//button[2]//i[1]");
    By productRemoved = By.xpath("//table[@class='table table-bordered']//a[contains(text(),'iPhone')]");

    public CartPage showAsserts(){
        try {
            assertEquals(assertTrueCartNotEmpty, "What would you like to do next?");
            System.out.println(">>> Shopping cart is NOT empty! <<<");
        } catch (Exception e){
            System.out.println(">>> Shopping cart is empty! <<<");
        }
        return this;
    }

    public CartPage showAssertsAfterRemoving(){
        try {
            assertEquals(productRemoved, "iPhone");
            System.out.println(">>>Product is removed successfully!<<<");
        } catch (Exception e){
            System.out.println(">>>Product was not removed!<<<");
        }
        return this;
    }

    public CartPage removeSecondProduct(){
        click(removeSecondProduct);
        return this;
    }


    public CartPage removeProductFromCart(){
        click(removeProduct);
        return this;
    }
}

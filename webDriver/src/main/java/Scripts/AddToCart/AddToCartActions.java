package Scripts.AddToCart;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AddToCartActions {
    AddToCartPage addToCartPage;

    public AddToCartActions(WebDriver driver) {
        addToCartPage = new AddToCartPage(driver);
    }


    public void showAsserts() {
        try {
            Assert.assertTrue(addToCartPage.assertTrueCartNotEmpty.isDisplayed());
            System.out.println(">>> Shopping cart is NOT empty! <<<");
        } catch (Exception e) {
            Assert.assertFalse(addToCartPage.assertFalseEmptyCart.isDisplayed());
            System.out.println(">>> Shopping cart is empty! <<<");
        }
    }

    public void accessShoppingCart() {
        addToCartPage.shoppingCartLink.click();
    }

    public void addToCartPage() {
        addToCartPage.addToCartButton.click();
    }

    public void inputQuantity(String quantity) {
        addToCartPage.inputQuantity.clear();
        addToCartPage.inputQuantity.sendKeys(quantity);
    }

    public void selectProduct() {
        addToCartPage.accessProduct.click();
    }

    public void selectCategory() {
        addToCartPage.accessCategory.click();
    }

    public void goToHomePage() {
        addToCartPage.homePage.click();
    }

    public void submitUserCredentials() {
        addToCartPage.loginButton.click();
    }

    public void enterPassword(String password) {
        addToCartPage.inputPasswordField.clear();
        addToCartPage.inputPasswordField.sendKeys(password);
    }

    public void enterEmail(String email) {
        addToCartPage.inputEmailField.clear();
        addToCartPage.inputEmailField.sendKeys(email);
    }

    public void getLoginPage() {
        addToCartPage.loginOption.click();
    }

    public void getMyAccountDropMenu() {
        addToCartPage.myAccount.click();
    }
}

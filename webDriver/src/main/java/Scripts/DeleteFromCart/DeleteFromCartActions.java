package Scripts.DeleteFromCart;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DeleteFromCartActions {
    DeleteFromCartPage deleteFromCartPage;
    public DeleteFromCartActions(WebDriver webDriver){
        deleteFromCartPage = new DeleteFromCartPage(webDriver);
    }

    public void getMyAccountDropMenu(){
        deleteFromCartPage.myAccount.click();
    }
    public void getLoginPage(){
        deleteFromCartPage.loginOption.click();
    }
    public void enterEmail(String email) {
        deleteFromCartPage.inputEmailField.clear();
        deleteFromCartPage.inputEmailField.sendKeys(email);
    }
    public void enterPassword(String password) {
        deleteFromCartPage.inputPasswordField.clear();
        deleteFromCartPage.inputPasswordField.sendKeys(password);
    }
    public void submitUserCredentials(){
        deleteFromCartPage.loginButton.click();
    }
    public void goToHomePage() {
        deleteFromCartPage.homePage.click();
    }
    public void selectCategory() {
        deleteFromCartPage.accessCategory.click();
    }
    public void selectProduct() {
        deleteFromCartPage.accessProduct.click();
    }
    public void inputQuantity(String quantity) {
        deleteFromCartPage.inputQuantity.clear();
        deleteFromCartPage.inputQuantity.sendKeys(quantity);
    }
    public void addToCartPage() {
        deleteFromCartPage.addToCartButton.click();
    }
    public void accessShoppingCart() {
        deleteFromCartPage.shoppingCartLink.click();
    }
    public void deleteFromCart() {
        deleteFromCartPage.removeFromCart.click();
    }
    public void showAsserts() {
        try {
            Assert.assertTrue(deleteFromCartPage.assertTrueEmptyCart.isDisplayed());
            System.out.println(">>> Shopping cart is empty! <<<");
        } catch (Exception e){
            Assert.assertFalse(deleteFromCartPage.assertFalseCartNotEmpty.isDisplayed());
            System.out.println(">>> Shopping cart is NOT empty! <<<");
        }
    }

}

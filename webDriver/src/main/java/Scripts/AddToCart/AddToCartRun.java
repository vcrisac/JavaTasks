package Scripts.AddToCart;

import org.openqa.selenium.WebDriver;

public class AddToCartRun {
    AddToCartActions addToCartActions;

    public AddToCartRun(WebDriver webDriver) {
        addToCartActions = new AddToCartActions(webDriver);
    }

    public void run(){
        addToCartActions.getMyAccountDropMenu();
        addToCartActions.getLoginPage();
        addToCartActions.enterEmail("jonjones@gmail.com");
        addToCartActions.enterPassword("123456");
        addToCartActions.submitUserCredentials();
        addToCartActions.goToHomePage();
        addToCartActions.selectCategory();
        addToCartActions.selectProduct();
        addToCartActions.inputQuantity("5");
        addToCartActions.addToCartPage();
        addToCartActions.accessShoppingCart();
        addToCartActions.showAsserts();
    }
}

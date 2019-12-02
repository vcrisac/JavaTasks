package Scripts.DeleteFromCart;

import org.openqa.selenium.WebDriver;

public class DeleteFromCartRun {
    DeleteFromCartActions deleteFromCartActions;

    public DeleteFromCartRun(WebDriver webDriver){
        deleteFromCartActions = new DeleteFromCartActions(webDriver);
    }
    public void run(){
        deleteFromCartActions.getMyAccountDropMenu();
        deleteFromCartActions.getLoginPage();
        deleteFromCartActions.enterEmail("jonjones@gmail.com");
        deleteFromCartActions.enterPassword("123456");
        deleteFromCartActions.submitUserCredentials();
        deleteFromCartActions.goToHomePage();
        deleteFromCartActions.selectCategory();
        deleteFromCartActions.selectProduct();
        deleteFromCartActions.inputQuantity("5");
        deleteFromCartActions.addToCartPage();
        deleteFromCartActions.accessShoppingCart();
        deleteFromCartActions.deleteFromCart();
        deleteFromCartActions.showAsserts();
    }

}

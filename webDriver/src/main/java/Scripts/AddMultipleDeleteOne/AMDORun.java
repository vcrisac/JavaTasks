package Scripts.AddMultipleDeleteOne;

import org.openqa.selenium.WebDriver;

public class AMDORun {
    AMDOActions amdoActions;
    public AMDORun(WebDriver webDriver){
        amdoActions = new AMDOActions(webDriver);
    }
    public void run(){
        amdoActions.getMyAccountDropMenu();
        amdoActions.getLoginPage();
        amdoActions.enterEmail("jonjones@gmail.com");
        amdoActions.enterPassword("123456");
        amdoActions.submitUserCredentials();
        amdoActions.goToHomePage();
        amdoActions.selectCategory();
        amdoActions.selectProduct();
        amdoActions.inputQuantity("4");
        amdoActions.addToCart();
        amdoActions.selectCategory2();
        amdoActions.selectProduct2();
        amdoActions.openCalendar();
        amdoActions.selectDeliveryDate();
        amdoActions.inputQuantity("5");
        amdoActions.addToCart();
        amdoActions.accessCategoryList();
        amdoActions.selectCategoryFromList();
        amdoActions.selectProduct3();
        amdoActions.accessReviewTab();
        amdoActions.writeReview("This is very good one! Recommend it!");
        amdoActions.rateProduct();
        amdoActions.sumbitReview();
        amdoActions.inputQuantity("3");
        amdoActions.addToCart();
        amdoActions.goToCart();
        amdoActions.removeProduct();
        amdoActions.showAsserts();
    }
}

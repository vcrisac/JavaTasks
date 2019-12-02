package Scripts.AddMultipleDeleteOne;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AMDOActions {
    AMDOPage amdoPage;

    public AMDOActions(WebDriver webDriver) {
        amdoPage = new AMDOPage(webDriver);
    }
    public void getMyAccountDropMenu() {
        amdoPage.myAccount.click();
    }
    public void getLoginPage() {
        amdoPage.loginOption.click();
    }
    public void enterEmail(String email) {
        amdoPage.inputEmailField.clear();
        amdoPage.inputEmailField.sendKeys(email);
    }
    public void enterPassword(String password) {
        amdoPage.inputPasswordField.clear();
        amdoPage.inputPasswordField.sendKeys(password);
    }
    public void submitUserCredentials() {
        amdoPage.loginButton.click();
    }

    public void goToHomePage() {
        amdoPage.homePage.click();
    }
    public void selectCategory() {
        amdoPage.accessCategory.click();
    }
    public void selectProduct() {
        amdoPage.accessProduct.click();
    }
    public void inputQuantity(String quantity) {
        amdoPage.inputQuantity.clear();
        amdoPage.inputQuantity.sendKeys(quantity);
    }
    public void addToCart() {
        amdoPage.addToCartButton.click();
    }
    public void selectCategory2() {
        amdoPage.accessCategory2.click();
    }
    public void selectProduct2() {
        amdoPage.accessProduct2.click();
    }
    public void openCalendar() {
        amdoPage.openDatePicker.click();
    }
    public void selectDeliveryDate() {
        amdoPage.selectDeliveryDate.click();
    }
    // input quantity  -------------------------------------------
    // add to cart button ----------------------------------------
    public void accessCategoryList() {
        amdoPage.accessCategory3.click();
    }
    public void selectCategoryFromList() {
        amdoPage.accessCategoryFromCategoryList.click();
    }
    public void selectProduct3() {
        amdoPage.accessProduct3.click();
    }
    public void accessReviewTab() {
        amdoPage.accessReviewTab.click();
    }
    public void writeReview(String review) {
        amdoPage.writeReview.sendKeys(review);
    }
    public void rateProduct() {
        amdoPage.selectRating.click();
    }
    public void sumbitReview() {
        amdoPage.submitReview.click();
    }
    // input quantity  -------------------------------------------
    // add to cart button ----------------------------------------
    public void goToCart() {
        amdoPage.checkCart.click();
    }
    public void removeProduct() {
        amdoPage.removeOneProduct.click();
    }
    public void showAsserts(){
        try {
            Assert.assertTrue(amdoPage.assertProductIsDeleted.isDisplayed());
            System.out.println(">>> Product successfully removed! <<<");
        } catch (Exception e){
            Assert.assertTrue(amdoPage.assertProductIsNotDeleted.isDisplayed());
            System.out.println(">>> Product was NOT removed! <<<");
        }
    }
}

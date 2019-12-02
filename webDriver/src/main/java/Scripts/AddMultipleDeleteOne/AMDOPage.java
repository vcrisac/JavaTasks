package Scripts.AddMultipleDeleteOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMDOPage {
    WebDriver webDriver;
    public AMDOPage(WebDriver webDriver){
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
    // input quantity  -------------------------------------------
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement inputQuantity;
    // add to cart button ----------------------------------------
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCartButton;

    @FindBy(xpath = "//a[contains(text(),'Desktops')]")
    WebElement accessCategory2;
    @FindBy(xpath = "//div[@class='image']//img[@class='img-responsive']")
    WebElement accessProduct2;
    @FindBy(xpath = "//i[@class='fa fa-calendar']")
    WebElement openDatePicker;
    @FindBy(xpath = "//td[@class='day'][contains(text(),'27')]")
    WebElement selectDeliveryDate;
    // input quantity  -------------------------------------------
    // add to cart button ----------------------------------------
    @FindBy(xpath = "//ul[@class='nav navbar-nav']//a[contains(text(),'Desktops')]")
    WebElement accessCategory3;
    @FindBy(xpath = "//a[contains(text(),'MP3 Players (4)')]")
    WebElement accessCategoryFromCategoryList;
    @FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[1]//a[1]//img[1]")
    WebElement accessProduct3;
    @FindBy(xpath = "//a[contains(text(),'Reviews (0)')]")
    WebElement accessReviewTab;
    @FindBy(xpath = "//textarea[@id='input-review']")
    WebElement writeReview;
    @FindBy(xpath = "//body//input[5]")
    WebElement selectRating;
    @FindBy(xpath = "//button[@id='button-review']")
    WebElement submitReview;
    // input quantity  -------------------------------------------
    // add to cart button ----------------------------------------
    @FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
    WebElement checkCart;
    @FindBy(xpath = "//tr[1]//td[4]//div[1]//span[1]//button[2]//i[1]")
    WebElement removeOneProduct;
    @FindBy(xpath = "//table[@class='table table-bordered']//a[contains(text(),'iPhone')]")
    WebElement assertProductIsDeleted;
    @FindBy(xpath = "//table[@class='table table-bordered']//a[contains(text(),'iPhone')]")
    WebElement assertProductIsNotDeleted;

}

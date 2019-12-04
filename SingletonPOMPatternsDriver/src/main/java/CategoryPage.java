import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends BasePage {
    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    private By accessProductIphone = By.xpath("//body//div[@class='row']//div[@class='row']//div[2]//div[1]//div[1]//a[1]//img[1]");
    private By accessProductIPod = By.xpath("//div[@id='content']//div[1]//div[1]//div[1]//a[1]//img[1]");

    public ProductPage accessProductPage(){
        click(accessProductIphone);
        return new ProductPage(driver);
    }

    public ProductPage accessProductIPod(){
        click(accessProductIPod);
        return new ProductPage(driver);
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CaterogyList extends BasePage {

    public CaterogyList(WebDriver driver) {
        super(driver);
    }

    private By desktopsCategory = By.xpath("//a[contains(text(),'Desktops')]");
    private By phonesCategory = By.xpath("//a[contains(text(),'Phones & PDAs (3)')]");
    private By mp3PlayersCategory = By.xpath("//div[@id='product-category']//a[contains(text(),'MP3 Players')]");

    public CategoryPage accessCategoryPage(){
        click(phonesCategory);
        return new CategoryPage(driver);
    }

    public CategoryPage accessSecondCategoryPage(){
        click(mp3PlayersCategory);
        return new CategoryPage(driver);
    }



}

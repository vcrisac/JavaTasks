package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public WebDriver setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcrisac\\IdeaProjects\\webDriver\\driver\\chromedriver.exe");
        return new ChromeDriver();
    }
}

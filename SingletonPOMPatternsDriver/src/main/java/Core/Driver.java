package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver webDriver;
    public static String browserName = "chrome";

    public static WebDriver initialize() {
        if (browserName.equalsIgnoreCase("chrome")) {
            if (webDriver == null) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcrisac\\IdeaProjects\\webDriver\\driver\\chromedriver.exe");
                webDriver = new ChromeDriver();
            }
        }
        webDriver.manage().deleteAllCookies();
        webDriver.manage().window().maximize();
        return webDriver;
    }

    public static void quit(){
        System.out.println("quitting the browser...");
        webDriver.quit();
        webDriver = null;
    }

}

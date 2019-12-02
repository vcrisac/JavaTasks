package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DrawBorder {
//    public static void drawBorder(WebDriver driver, WebElement element){
////        WebElement element_node = driver.findElement(By.xpath(xpath));
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].style.border='2px solid red'", element);
//    }

    public static void drawBorder(WebDriver driver, String xpath){
        WebElement element_node = driver.findElement(By.xpath(xpath));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='2px solid red'", xpath);
    }
}

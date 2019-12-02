package Scripts.DeleteFromCart;

import Driver.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// delete from cart

public class DeleteFromCart {

    public void run() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcrisac\\IdeaProjects\\webDriver\\driver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://172.23.176.168/");

//        DrawBorder.drawBorder(webDriver, "//span[contains(text(),'My Account')]");
//        webDriver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();

//        DrawBorder.drawBorder(webDriver, "//a[contains(text(),'Login')]");
//        webDriver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

//        DrawBorder.drawBorder(webDriver, "//input[@id='input-email']");
//        Thread.sleep(500);
//        webDriver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("john.black@gmail.com");

//        DrawBorder.drawBorder(webDriver, "//input[@id='input-password']");
//        Thread.sleep(500);
//        webDriver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("qweasd");

//        DrawBorder.drawBorder(webDriver, "//input[@class='btn btn-primary']");
//        Thread.sleep(500);
//        webDriver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

//        DrawBorder.drawBorder(webDriver, "//i[@class='fa fa-home']");
//        webDriver.findElement(By.xpath("//i[@class='fa fa-home']")).click();

//        DrawBorder.drawBorder(webDriver, "//a[contains(text(),'Phones & PDAs')]");
//        webDriver.findElement(By.xpath("//a[contains(text(),'Phones & PDAs')]")).click();

//        List<WebElement> elementList = webDriver.findElements(By.xpath("//body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[2]/"));

//        DrawBorder.drawBorder(webDriver, "//body//div[@class='row']//div[@class='row']//div[2]//div[1]//div[1]//a[1]//img[1]");
//        webDriver.findElement(By.xpath("//body//div[@class='row']//div[@class='row']//div[2]//div[1]//div[1]//a[1]//img[1]")).click();

//        DrawBorder.drawBorder(webDriver, "//input[@id='input-quantity']");
//        Thread.sleep(500);
//        WebElement inputQuantityField = webDriver.findElement(By.xpath("//input[@id='input-quantity']"));
//        inputQuantityField.clear();
//        inputQuantityField.sendKeys("10");

//        DrawBorder.drawBorder(webDriver, "//button[@id='button-cart']");
//        Thread.sleep(500);
//        webDriver.findElement(By.xpath("//button[@id='button-cart']")).click();

//        DrawBorder.drawBorder(webDriver, "//span[contains(text(),'Shopping Cart')]");
//        webDriver.findElement(By.xpath("//span[contains(text(),'Shopping Cart')]")).click();

//        webDriver.findElement(By.xpath("//i[@class='fa fa-times-circle']")).click();
        try {
            Assert.assertTrue(webDriver.findElement(By.xpath("//h2[contains(text(),'What would you like to do next?')]")).isDisplayed());
            System.out.println(">>> Shopping cart is NOT empty! <<<");
        } catch (Exception e) {
            Assert.assertTrue(webDriver.findElement(By.xpath("//a[@class='btn btn-primary']")).isDisplayed());
            System.out.println(">>> Shopping cart is empty! <<<");
        }
        webDriver.quit();
    }
}

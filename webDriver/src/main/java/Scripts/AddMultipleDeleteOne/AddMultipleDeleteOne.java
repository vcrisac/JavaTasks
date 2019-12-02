package Scripts.AddMultipleDeleteOne;

import Driver.DrawBorder;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// delete from cart

public class AddMultipleDeleteOne {

    public void run() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcrisac\\IdeaProjects\\webDriver\\driver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://172.23.176.168/");

//        DrawBorder.drawBorder(webDriver, "//span[contains(text(),'My Account')]");
        webDriver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();

//        DrawBorder.drawBorder(webDriver, "//a[contains(text(),'Login')]");
        webDriver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

        DrawBorder.drawBorder(webDriver, "//input[@id='input-email']");
        Thread.sleep(500);
        webDriver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("john.black@gmail.com");

        DrawBorder.drawBorder(webDriver, "//input[@id='input-password']");
        Thread.sleep(500);
        webDriver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("qweasd");

        DrawBorder.drawBorder(webDriver, "//input[@class='btn btn-primary']");
        Thread.sleep(500);
        webDriver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

//        DrawBorder.drawBorder(webDriver, "//i[@class='fa fa-home']");
//        webDriver.findElement(By.xpath("//i[@class='fa fa-home']")).click();

//        DrawBorder.drawBorder(webDriver, "//a[contains(text(),'Phones & PDAs')]");
//        webDriver.findElement(By.xpath("//a[contains(text(),'Phones & PDAs')]")).click();

//        List<WebElement> elementList = webDriver.findElements(By.xpath("//body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[2]/"));

        // select product from category
//        DrawBorder.drawBorder(webDriver, "//body//div[@class='row']//div[@class='row']//div[2]//div[1]//div[1]//a[1]//img[1]");
//        webDriver.findElement(By.xpath("//body//div[@class='row']//div[@class='row']//div[2]//div[1]//div[1]//a[1]//img[1]")).click();
        // select quantity
//        DrawBorder.drawBorder(webDriver, "//input[@id='input-quantity']");
//        Thread.sleep(500);
//        WebElement inputQuantityField = webDriver.findElement(By.xpath("//input[@id='input-quantity']"));
//        inputQuantityField.clear();
//        inputQuantityField.sendKeys("10");
        // add to cart
//        DrawBorder.drawBorder(webDriver, "//button[@id='button-cart']");
//        Thread.sleep(500);
//        webDriver.findElement(By.xpath("//button[@id='button-cart']")).click();
        // go to category page
//        webDriver.findElement(By.xpath("//a[contains(text(),'Desktops')]")).click();
        // select product
//        webDriver.findElement(By.xpath("//div[@class='image']//img[@class='img-responsive']")).click();
        // open datepicker
//        webDriver.findElement(By.xpath("//i[@class='fa fa-calendar']")).click();
        // select delivery date
//        webDriver.findElement(By.xpath("//td[@class='day'][contains(text(),'27')]")).click();
//        // select quantity
//        WebElement quantity = webDriver.findElement(By.xpath("//input[@id='input-quantity']"));
//        quantity.clear();
//        quantity.sendKeys("5");
        // add to cart
//        webDriver.findElement(By.xpath("//button[@id='button-cart']")).click();
        // access category list
//        webDriver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[contains(text(),'Desktops')]")).click();
        // select category (mp3 players)
//        webDriver.findElement(By.xpath("//a[contains(text(),'MP3 Players (4)')]")).click();
        // select product - ipod
//        webDriver.findElement(By.xpath("//div[@id='content']//div[1]//div[1]//div[1]//a[1]//img[1]")).click();
        // access Review tab
//        webDriver.findElement(By.xpath("//a[contains(text(),'Reviews (0)')]")).click();
        // write review
//        webDriver.findElement(By.xpath("//textarea[@id='input-review']")).sendKeys("This is very good one! Recommend it!");
        // select rating
//        webDriver.findElement(By.xpath("//body//input[5]")).click();
        // continue button
//        webDriver.findElement(By.xpath("//button[@id='button-review']")).click();
        // select quantity
//        webDriver.findElement(By.xpath("//input[@id='input-quantity']")).sendKeys("4");
        // add product to cart
//        webDriver.findElement(By.xpath("//button[@id='button-cart']")).click();
        // check cart
//        webDriver.findElement(By.xpath("//span[contains(text(),'Shopping Cart')]")).click();
        // remove one product
        webDriver.findElement(By.xpath("//tr[1]//td[4]//div[1]//span[1]//button[2]//i[1]")).click();


        try {
            Assert.assertFalse(webDriver.findElement(By.xpath("//table[@class='table table-bordered']" +
                    "//a[contains(text(),'iPhone')]")).isDisplayed());
            System.out.println(">>> Product successfully removed! <<<");
        } catch (Exception e) {
            Assert.assertTrue(webDriver.findElement(By.xpath("//table[@class='table table-bordered']//a[contains(text(),'iPhone')]")).isDisplayed());
            System.out.println(">>> Product was NOT removed! <<<");
        }


        // My Account dropdown menu
//        webDriver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
//        webDriver.findElement(By.cssSelector("")).click();
        //Logout
//        webDriver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
        // close web driver
//        webDriver.quit();
    }
}

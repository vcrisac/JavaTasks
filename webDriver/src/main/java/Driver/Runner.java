package Driver;

import Scripts.AddMultipleDeleteOne.AMDORun;
import Scripts.AddToCart.AddToCartRun;
import Scripts.DeleteFromCart.DeleteFromCartRun;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Runner {
    Driver driverOprions = new Driver();
    WebDriver webDriver;
    AddToCartRun addToCartRun;
    DeleteFromCartRun deleteFromCartRun;
    AMDORun amdoRun;

    @Before
    public void setUp() {
        webDriver = driverOprions.setDriver();
        addToCartRun = new AddToCartRun(webDriver);
        deleteFromCartRun = new DeleteFromCartRun(webDriver);
        amdoRun = new AMDORun(webDriver);
        webDriver.manage().window().maximize();
        webDriver.get("https://172.23.176.168/");
    }

    @Test
    public void addProductToCart() {
//        addToCartRun.run();
//        deleteFromCartRun.run();
        amdoRun.run();

    }

//    @After
    public void tearDown() {
        webDriver.quit();
    }

}

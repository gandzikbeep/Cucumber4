package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {

    public WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }

    By productName= By.cssSelector("p.product-name");

    By cartImg= By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]");

    By checkoutBtn= By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");

    public WebElement getProductName(){
        return driver.findElement(productName);
    }

    public WebElement getCart(){
        return driver.findElement(cartImg);
    }
    public WebElement getCheckout(){
        return driver.findElement(checkoutBtn);
    }


}

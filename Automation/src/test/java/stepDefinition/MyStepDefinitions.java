package stepDefinition;

import Cucumber.Automation.Base;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import utilities.Screenshots;

import java.io.IOException;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends Base {

    WebDriver driver;
    HomePage h;
    CheckOutPage cp;


    public MyStepDefinitions() {
        this.driver = Base.driver;

    }

    @Given("^User is on Greencart Landing page$")
    public void user_is_on_greencart_landing_page()  {
        h = new HomePage(driver);
        Assert.assertTrue( h.driver.getPageSource().contains("GreenKart - veg and fruits kart"));

    }


    @When("^User searched for (.+) Vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {

        h.getSearch().sendKeys(strArg1);
        Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1)  {
        Assert.assertTrue(h.getProductName().getText().contains(strArg1));
    }


    @And("^Added items to cart$")
    public void added_items_to_cart()  {
        h.increment().click();
        h.addToCart().click();
    }

    @And("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase()  {
        cp = new CheckOutPage(driver);
        cp.getCart().click();
        cp.getCheckout().click();


//        driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
//        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

    }



}


//public class MyStepDefinitions {
//    public WebDriver driver;
//    HomePage h;
//
//    @Given("User is on Greencart Landing page")
//    public void user_is_on_greencart_landing_page() throws IOException {
//        driver = Base.getDriver();
//    }
//
//    @When("^User searched for (.+) Vegetable$")
//    public void user_searched_for_vegetable(String strArg1) {
//        h = new HomePage(driver);
//        h.getSearch().sendKeys(strArg1);
//    }
//
//    @Then("^\"([^\"]*)\" results are displayed$")
//    public void something_results_are_displayed(String strArg1)  {
//        Assert.assertTrue( h.getProductName().getText().contains(strArg1));
//        System.out.println("This step isnt working");  // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! not working
//    }
//
//
//    @And("^Added items to cart$")
//    public void added_items_to_cart() throws Throwable {
//        h.increment().click();
//        h.addToCart().click();
//    }
//
//    @And("User proceeded to Checkout page for purchase")
//    public void user_proceeded_to_checkout_page_for_purchase() {
//        driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
//        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
//
//        //   //button[@type='button']
//    }
//
////    @Then("^verify selected \"([^\"]*)\" items are displayed in Check out page$")
////    public void verify_selected_items_are_displayed_in_check_out_page(String strArg1) {
////        // Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
////        System.out.println("This step isnt working");  // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! not working
////    }
//
//}

package stepDefinition;

import Cucumber.Automation.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import pageObjects.CheckOutPage;

import java.util.List;

@RunWith(Cucumber.class)
public class stepDefinition extends Base {


    CheckOutPage cp;

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page()  {

        System.out.println("navigated to login url");


    }

    @When("^User searched for (.+) Vegetables$")
    public void user_searched_for_vegetables(String name)  {
        System.out.println("cos tam");
    }


    @Then("^verify selected (.+) items are displayed in Check out page$")
    public void verify_selected_items_are_displayed_in_check_out_page(String name)  {
        cp=new CheckOutPage(driver);
        Assert.assertTrue( cp.getProductName().getText().contains(name));
    }

    //-------------BACKGROUND --------------

//    @Given("^validate the browser$")
//    public void validate_the_browser() throws Throwable {
//        System.out.println("deciding the browser to open");
//        Assert.assertTrue( cp.getProductName().getText().contains("fsdf"));
//
//    }
//
//    @When("^Browser is triggered$")
//    public void browser_is_triggered() throws Throwable {
//        System.out.println("Browser is triggered");
//    }

//    @Then("^check if browser is started$")
//    public void check_if_browser_is_started() throws Throwable {
//        System.out.println("Browser is started");
//    }
    //-------------BACKGROUND --------------

    @Then("^Home page is populated$")
    public void home_page_is_populated()  {
        //home page validation
        System.out.println("Validated home page");
    }



    @Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg1);
    }


    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data)  {
        List<List<String>>  obj=data.asLists();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));



    }
    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password)  {
        System.out.println(username);
        System.out.println(password);

    }

//        @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
//    public void user_login_into_application_with_username_and_password(String strArg1, String strArg2) {
//        System.out.println(strArg1);
//        System.out.println(strArg2);
//    }

    @When("^User login into application with (.+) and password (.+)$")
    public void user_login_into_application_with_user1_and_password_pass1(String username, String password) {
        System.out.println("username: " + username + " and password: " + password);

    }

}

















//public class stepDefinition extends Base {
//
//    //Background
//    @Given("validate the browser")
//    public void validate_the_browser() {
//        System.out.println("choosing the browser ");
//    }
//
//    @When("Browser is triggered")
//    public void browser_is_triggered() {
//        System.out.println("browser is trigered");
//    }
//
//    @Then("Check if browser is displayed")
//    public void check_if_browser_is_displayed() {
//        System.out.println("browser is started");
//    }
////_____________________________________________________________________
//
//    @Given("^User is on NetBanking landing page$")
//    public void user_is_on_net_banking_landing_page() {
//        System.out.println("navigate to login url");
//
//    }
//
////    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
////    public void user_login_into_application_with_username_and_password(String strArg1, String strArg2) {
////        System.out.println(strArg1);
////        System.out.println(strArg2);
////    }
//
//    @When("^User login into application with (.+) and password (.+)$")
//    public void user_login_into_application_with_user1_and_password_pass1(String username, String password) {
//        System.out.println("username: " + username + " and password: " + password);
//
//    }
//
//    @Then("^Home page is populated$")
//    public void home_page_is_populated() {
//        System.out.println("Validate home page");
//
//    }
//
//
//    @And("Cards displayed are {string}")
//    public void cards_displayed_are(String string) {
//        System.out.println(string);
//    }
//
//    @When("User sign up with following details")
//    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
//        List<List<String>> obj = data.asLists();
//        System.out.println(obj.get(0).get(0));
//        System.out.println(obj.get(0).get(1));
//        System.out.println(obj.get(0).get(2));
//        System.out.println(obj.get(0).get(3));
//        System.out.println(obj.get(0).get(4));
//
//    }
//
//}

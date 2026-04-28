package Steps;

import LibraryFiles.DriverFactory;
import PageClasses.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SwagLabProductSteps
{
    SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);
    SwagLabYourCartPage yourCart=new SwagLabYourCartPage(DriverFactory.driver);
    SwagLabCheckoutYourInfoPage yourInfoPage=new SwagLabCheckoutYourInfoPage(DriverFactory.driver);
    SwagLabCheckoutOverviewPage checkoutOverviewPage=new SwagLabCheckoutOverviewPage(DriverFactory.driver);
    SwagLabCheckoutCompletePage checkoutCompletePage=new SwagLabCheckoutCompletePage(DriverFactory.driver);

    @When("wait for {int} seconds")
    public void wait_for_seconds(Integer timeInSec) throws InterruptedException
    {
        Thread.sleep(timeInSec*1000);
    }

    @Then("user can see {int} products on home page")
    public void user_can_see_products_on_home_page(Integer expProductCount)
    {
        int actProductCount=home.getProductCount();
        Assert.assertEquals(actProductCount,expProductCount,"Product count mismatch");

    }
    @Then("price of the SauceLabBackPack product should {double}")
    public void price_of_the_sauce_lab_back_pack_product_should(Double expProductPrice)
    {
        double actProductPrice=home.getBackPackProductPrice();
        Assert.assertEquals(actProductPrice,expProductPrice,"act & exp Product price mismatch");
    }

    @Then("total price of the products should {double}")
    public void total_price_of_the_products_should(Double expTotalPrice)
    {
       double actTotalPrice = home.getAllProductsTotalPrice();
       Assert.assertEquals(actTotalPrice,expTotalPrice,"Total price mismatch");
    }

    @When("user click on backpack products add to cart btn")
    public void user_click_on_backpack_products_add_to_cart_btn()
    {
       home.clickOnBackPackProductAddToCartBtn();
    }

    @When("user click on cart link")
    public void user_click_on_cart_link()
    {
       home.clickOnCartLink();
    }
    @When("user click on checkout button")
    public void user_click_on_checkout_button()
    {
       yourCart.clickOnCheckoutButton();
    }

    @When("user enter FN as {string}")
    public void user_enter_fn_as(String firstname)
    {
        yourInfoPage.enterFN(firstname);
    }
    @When("user enter LN as {string}")
    public void user_enter_ln_as(String lastname)
    {
        yourInfoPage.enterLN(lastname);
    }

    @When("user click on zip code as {string}")
    public void user_click_on_zip_code_as(String zipcode)
    {
        yourInfoPage.enterPinCode(zipcode);
    }
    @When("user click on continue button")
    public void user_click_on_continue_button()
    {
        yourInfoPage.clickOnContinueButton();
    }

    @When("user click on Finish button")
    public void user_click_on_finish_button()
    {
        checkoutOverviewPage.clickOnFinishButton();
    }
    @Then("order success message should be visible with message {string}")
    public void order_success_message_should_be_visible_with_message(String expMsg)
    {
       String actMsg=checkoutCompletePage.getOrderPlaceMsg();
       Assert.assertEquals(actMsg,expMsg,"order place msg mismatched");
    }

}

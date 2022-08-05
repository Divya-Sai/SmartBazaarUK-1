package stepDefinition;

import Pages.basePage;
import Pages.smartBazaarUKAccountPage;
import Pages.smartBazaarUKHomePage;
import Pages.smartBazaarUKProdHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class steps {

    basePage bp;
    WebDriver driver;
    smartBazaarUKHomePage homepage;
    smartBazaarUKAccountPage accountPage;
    smartBazaarUKProdHomePage prodHomePage;


    @Given("I can see {string} browser")
    public void i_can_see_browser(String browserName) {
        bp = new basePage();
        bp.setBrowser(browserName);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("I enter the smartbazaar link {string}")
    public void i_enter_the_smartbazaar_link(String url) throws InterruptedException {
//        bp.getbaseurl(url);
        driver.get(url);
        Thread.sleep(2000);
    }

    @Then("I click on LoginDropDown")
    public void i_click_on_login_drop_down() throws InterruptedException {
        Thread.sleep(500);
//        driver.findElement(By.xpath(".//li[@class='dropdown']")).click();
//        driver.findElement(By.xpath(".//a[contains(text(),'Login')]")).click();
        homepage = new smartBazaarUKHomePage(driver);
        homepage.navigatetoLoginScreen();

    }
    @Then("I validate the title of the Page is {string}")
    public void i_validate_the_title_of_the_page_is(String title) {
        Assert.assertEquals(driver.getTitle(),title);
    }

    @Then("I close the browser")
    public void i_close_the_browser() {
            driver.quit();
    }

    @Then("I enter the username as {string}")
    public void i_enter_the_username_as(String uname) throws InterruptedException {
        accountPage = new smartBazaarUKAccountPage(driver);
        Thread.sleep(3000);
        accountPage.enterUserdetails(uname);
    }
    @Then("I enter the password as {string}")
    public void i_enter_the_password_as(String pwd) {
        accountPage.enterUserPassword(pwd);
    }

    @Then("I click on LoginButtonInAccountPage")
    public void i_click_on_login_button_in_account_page()  {
        accountPage.clickOnLoginAccountPage();
    }

    @Then("I click on Select Category dropDown")
    public void i_click_on_select_category_drop_down()  {
        homepage.clickSelectCategory();
    }

    @Then("I enter text in SearchBox {string}")
    public void i_enter_text_in_search_box(String searchItemName) {
        homepage.setvalueInSearchBox(searchItemName);
    }

    @Then("I click on SearchIcon")
    public void i_click_on_search_icon() {
        homepage.clickOnSearch();

    }

    @Then("I click on Seasonal from menu options")
    public void i_click_on_seasonal_from_menu_options() throws InterruptedException {
        Thread.sleep(5000);
        homepage.clickfromMainMenuOptions();
    }

    @Then("I enter the product name {string} in the SearchBox")
    public void i_enter_the_product_name_in_the_search_box(String item) {
        prodHomePage = new smartBazaarUKProdHomePage(driver);
        prodHomePage.SearchItemText(item);
    }

    @Then("I click on Search Symbol")
    public void i_click_on_search_symbol() {
        prodHomePage.clicksearchSymbol();
    }

    @Then("I click on AskForProduct")
    public void iClickOnAskForProduct() {
        prodHomePage.clickOnAskforProduct();
    }
}

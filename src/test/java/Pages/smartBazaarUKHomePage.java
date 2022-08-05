package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class smartBazaarUKHomePage {
    WebDriver driver;

    //WebElements
    @FindBy(xpath=".//li[@class='dropdown']")
    private WebElement btnSmartBazaarHomeLogindrpdwn;

    @FindBy(xpath=".//a[contains(text(),'Login')]")
    private WebElement btnSmartBazaarHomeLogin;

    @FindBy(xpath="//body/div[@class='page homepage']/div[@class='header']/div[@class='primary-navbar']/div[@class='primary-menu']/ul[@class='primary-cat-menu']/li[@class='main-category dropdown']/a[1]")
    private WebElement drpdwnmainCategoryHome;

    @FindBy(id="62ea7682773dc")
    private WebElement txtSearch;

    @FindBy(xpath=".//div[@class='aws-search-btn aws-form-btn']")
    private WebElement btnSearchIcon;

    //.//ul[@id='menu-main-menu']/li/a[@title='']

    public smartBazaarUKHomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void navigatetoLoginScreen(){
        btnSmartBazaarHomeLogindrpdwn.click();
        btnSmartBazaarHomeLogin.click();
    }

    public void clickSelectCategory()  {
            drpdwnmainCategoryHome.click();
    }

    public void setvalueInSearchBox(String searchItem){
        txtSearch.sendKeys(searchItem);
    }

    public void clickOnSearch(){
        btnSearchIcon.click();
    }

    public void clickfromMainMenuOptions(){
        driver.findElement(By.xpath(".//li[@class='seasonal']")).click();
    }
}

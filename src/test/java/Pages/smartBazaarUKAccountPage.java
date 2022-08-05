package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class smartBazaarUKAccountPage {

    WebDriver driver;
    //WebElements
    @FindBy(xpath=".//button[@aria-controls='login_collapse']")
    private WebElement btnSmartBazaarAccountLogindrpdwn;

    @FindBy(id="username")
    private WebElement txtusernameAccountPage ;

    @FindBy(id="password")
    private WebElement txtPasswordAccountPage;

    @FindBy(xpath=".//button[@name='login']")
    private WebElement btnLoginAccountPage;

    public smartBazaarUKAccountPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUserdetails(String userdetails){
        btnSmartBazaarAccountLogindrpdwn.click();
        txtusernameAccountPage.sendKeys(userdetails);
    }

    public void enterUserPassword(String userPass){
        txtPasswordAccountPage.sendKeys(userPass);
    }

    public void clickOnLoginAccountPage(){
        btnLoginAccountPage.click();
    }



}

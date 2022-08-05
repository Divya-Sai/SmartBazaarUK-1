package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class smartBazaarUKProdHomePage {

    WebDriver driver;

    @FindBy(id="62ece5afa14bf")
    private WebElement txtSearchBoxProd;

    @FindBy(xpath="(.//span[@class='aws-search-btn_icon'])[1]")
    private WebElement btnSearchProd;

    public smartBazaarUKProdHomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void SearchItemText(String itemName){
        txtSearchBoxProd.sendKeys(itemName);
    }

    public void clicksearchSymbol(){
        btnSearchProd.click();
    }


}

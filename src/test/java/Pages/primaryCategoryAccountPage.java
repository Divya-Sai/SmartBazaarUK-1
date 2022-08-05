package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class primaryCategoryAccountPage {

    WebDriver driver;

    //WebElements
    @FindBy(xpath=".//li[@class='main-category dropdown']")
    private WebElement drpdwnMainCategory;


}

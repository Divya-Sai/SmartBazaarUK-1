package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class basePage {

    WebDriver driver;

    public void setBrowser(String Name){
        if (Name.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
        }
        else if (Name.equalsIgnoreCase("Firefox")){
            WebDriverManager.firefoxdriver().setup();
        }
        else if (Name.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
        }
        else{
            System.out.println("No Matching found");
        }
    }
}

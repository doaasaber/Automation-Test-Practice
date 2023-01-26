package Pages;

import org.openqa.selenium.WebDriver;

public class RetrivePassPage {
    private WebDriver driver;
    public RetrivePassPage(WebDriver driver){
        this.driver=driver;
            }

    public String GetTitle(){
        return  driver.getTitle();
    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPassPage {
    private WebDriver driver;
    private By EmailField= By.id("email");
    private By Button=By.id("form_submit");
    public  ForgetPassPage(WebDriver driver){
        this.driver=driver;
    }

    public void setEmailField(String Email) {
        driver.findElement(EmailField).sendKeys(Email);
    }
    public RetrivePassPage ClickOnButton(){
        driver.findElement(Button).click();
        return new RetrivePassPage(driver);
    }
}

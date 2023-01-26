package Pages;

import org.openqa.selenium.WebDriver;

public class AlertForm {
    private WebDriver driver;
    public AlertForm(WebDriver driver){
        this.driver=driver;

    }
    public void Accept(){
        driver.switchTo().alert().accept();
    }

    public void dismiss(){
        driver.switchTo().alert().dismiss();
    }
    public void setText(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getText(){
      return driver.switchTo().alert().getText();
    }
}

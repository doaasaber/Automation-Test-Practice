package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea {
   private WebDriver driver;
   private  By Alert= By.id("flash");
   public SecureArea(WebDriver driver){
        this.driver=driver;
    }
    public String GetAlert(){
       return driver.findElement(Alert).getText();
    }
}

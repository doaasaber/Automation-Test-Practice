package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
  private   WebDriver driver;
  private By AlertButton= By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
  private By ConfirmButton =By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
  private By PromptButton=By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
  private By Result=By.id("result");
   public AlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public AlertForm CliclOnAlert(){
       driver.findElement(AlertButton).click();
       return new AlertForm(driver);
    }
    public AlertForm CliclOnConfirm(){
        driver.findElement(ConfirmButton).click();
        return new AlertForm(driver);

    } public AlertForm CliclOnPrompt(){
        driver.findElement(PromptButton).click();
        return new AlertForm(driver);
    }
    public String result(){
       return  driver.findElement(Result).getText();
    }

}

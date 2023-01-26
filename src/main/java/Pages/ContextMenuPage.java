package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By Box= By.id("hot-spot");
    public ContextMenuPage(WebDriver driver){
        this.driver=driver;
    }
    public void ClickOnBox(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(Box)).perform();    }
    public String result(){
        return driver.switchTo().alert().getText();
    }
    public void Confirm(){
         driver.switchTo().alert().accept();
    }

}

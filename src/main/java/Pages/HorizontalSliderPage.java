package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By bar= By.tagName("input");
    private By Range=By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver=driver;
    }
    public void ClickonBar(){
        driver.findElement(bar).sendKeys(Keys.chord(Keys.ARROW_UP,Keys.ARROW_UP));


    }
    public String GetResult(){
           return driver.findElement(Range).getText();
    }

}

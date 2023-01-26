package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerts {
    WebDriver driver;
    By AlertExamples= By.linkText("Alerts Example");
    By AlertBox=By.id("simple");
    By TryButton1=By.id("confirm");
    By result=By.id("demo");
    By prompt=By.id("prompt");
    By result2=By.id("prompt_demo");
    public Alerts(WebDriver driver){
        this.driver=driver;
    }
    public String Alert1(){
        driver.findElement(AlertExamples).click();
        driver.findElement(AlertBox).click();
        Alert alert=driver.switchTo().alert();
        String text=alert.getText();
        alert.accept();
        return text;
    }
    public String Confirm(){
        driver.findElement(AlertExamples).click();
        driver.findElement(TryButton1).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        String text=driver.findElement(result).getText();
        return text;
    }
    public String dismiss(){
        driver.findElement(AlertExamples).click();
        driver.findElement(TryButton1).click();
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
        String text=driver.findElement(result).getText();
        return text;
    }

    public String promptAlert(String name){
        driver.findElement(AlertExamples).click();
        driver.findElement(prompt).click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys(name);
        alert.accept();
        String text=driver.findElement(result2).getText();
        return text;
    }

}

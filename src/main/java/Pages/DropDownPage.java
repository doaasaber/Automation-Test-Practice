package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;

public class DropDownPage {
    private WebDriver driver;
    private By dropdown= By.id("dropdown");
   public DropDownPage(WebDriver driver){
        this.driver=driver;
    }
    private Select FindFromDropDown(){
       return  new Select(driver.findElement(dropdown));
    }
    public void SelectFromDropDown(String option){
       FindFromDropDown().selectByVisibleText(option);
    }
    public List<String> GetAllSelected(){
        List<WebElement> selected = FindFromDropDown().getAllSelectedOptions();
        return  selected.stream().map(e->e.getText()).toList();
    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragNDropPage {
  private   WebDriver driver;
  private By dragNDrop=By.linkText("Drag & Drop Example");
  private By Source=By.id("draggable");
  private By Target=By.id("droppable");
  public DragNDropPage(WebDriver driver){
      this.driver=driver;
  }
  public String DragNDrop(){
      driver.findElement(dragNDrop).click();
      Actions action=new Actions(driver);
      action.dragAndDrop(driver.findElement(Source),driver.findElement(Target)).perform();
      return driver.findElement(Target).getText();

  }
}

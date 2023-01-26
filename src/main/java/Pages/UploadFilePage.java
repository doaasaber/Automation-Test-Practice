package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFilePage {
    private WebDriver driver;
    private By file= By.id("file-upload");
    private By Button=By.id("file-submit");
    private  By Result=By.xpath("//*[@id=\"uploaded-files\"]");
    public UploadFilePage(WebDriver driver){
        this.driver=driver;
    }
    public void UploadFile(String path){
        driver.findElement(file).sendKeys(path);
        driver.findElement(Button).click();
    }
    public String result(){
        return  driver.findElement(Result).getText();
    }
}

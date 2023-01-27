package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Date;

public class HomePage {
    private  By FormAuthentication=By.linkText("Form Authentication");
    private  By DropDown =By.linkText("Dropdown");
    private By ForgetPass=By.linkText("Forgot Password");
    private By HorizontalSlider=By.linkText("Horizontal Slider");
    private By Alerts=By.linkText("JavaScript Alerts");
    private By UploadFile=By.linkText("File Upload");
    private By ContextMenu=By.linkText("Context Menu");
    private WebDriver driver;
   public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public LoginPage ClickFormAuthentication(){
        driver.findElement(FormAuthentication).click();
        return  new LoginPage(driver);
    }
    public DropDownPage ClickDropDown(){
        driver.findElement(DropDown).click();
        return  new DropDownPage(driver);
    }
    public DragNDropPage DragMe(){
        return  new DragNDropPage(driver);
    }
    public Alerts Alert1(){
        return  new Alerts(driver);
    }
    public DropDownPage DoubleClick(){
        //driver.findElement(DropDown).click();
        return  new DropDownPage(driver);
    }
    public Scroll ScrollPage(){
        //driver.findElement(DropDown).click();
        return  new Scroll(driver);
    }
    public ScreenShotPage ss(){
        //driver.findElement(DropDown).click();
        return  new ScreenShotPage(driver);
    }
    public BrokenImgPage brokenImgPage(){
        //driver.findElement(DropDown).click();
        return  new BrokenImgPage(driver);
    }
    public DownloadFilePage downloadFilePage(){
        //driver.findElement(DropDown).click();
        return  new DownloadFilePage(driver);
    }
    public ForgetPassPage ClickForgetPass(){
        driver.findElement(ForgetPass).click();
        return  new ForgetPassPage(driver);
    }
    public UploadFilePage ClickUploadFile(){
        driver.findElement(UploadFile).click();
        return  new UploadFilePage(driver);
    }
    public HorizontalSliderPage ClickOnHorizontalSlider(){
       driver.findElement(HorizontalSlider).click();
       return new HorizontalSliderPage(driver);
    }
    public AlertsPage ClickOnAlerts(){
        driver.findElement(Alerts).click();
        return new AlertsPage(driver);
    }
    public ContextMenuPage ClickOnContextMenu(){
        driver.findElement(ContextMenu).click();
        return new ContextMenuPage(driver);
    }
    public Data Excel (){
       return new Data();
    }
}

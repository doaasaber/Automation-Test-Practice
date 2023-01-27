package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.HashMap;

public class DownloadFilePage {
    WebDriver driver;
    By DownloadLink= By.linkText("File Download");
    public  DownloadFilePage(WebDriver driver){
        this.driver=driver;
    }

    public void DownloadFile(){
        driver.findElement(DownloadLink).click();
        driver.findElement(By.linkText("luminoslogo.png")).click();
    }

}

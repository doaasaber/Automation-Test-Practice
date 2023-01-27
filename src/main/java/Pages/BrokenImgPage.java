package Pages;

import org.apache.http.client.methods.HttpGet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.List;

public class BrokenImgPage {
    WebDriver driver;
    By ImageLink= By.linkText("Broken Images");
    int count;
    public BrokenImgPage (WebDriver driver){
        this.driver=driver;
    }
    public int ImageBroken(){
        driver.findElement(ImageLink).click();
        count=0;
        List<WebElement>images=driver.findElements(By.tagName("img"));
        for(WebElement img : images){

        }
        return count;
    }

   /* public void VerifyImgActive(WebElement imageElement){
        HttpClient client = HttpClient.newBuilder().build();
        HttpGet request=new HttpGet(imageElement.getAttribute("src"));
        try{
           HttpResponse response=client.execute(request);
           if(response.getStatusLine().getStatusCode()!=200){
               count++;
           }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }*/
}

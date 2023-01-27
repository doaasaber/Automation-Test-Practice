package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroll {
    WebDriver driver;
    public  Scroll(WebDriver driver){
        this.driver=driver;
    }

    public void ScrollPage() throws InterruptedException {
        driver.navigate().to("https://www.amazon.eg/");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        Thread.sleep(3000);

        js.executeScript("scrollBy(0,3000)");
        Thread.sleep(3000);
    }
}

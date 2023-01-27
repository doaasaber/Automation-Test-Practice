package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScreenShotPage {
    WebDriver driver;
    By SearchBar= By.id("twotabsearchtextbox454");
    public ScreenShotPage(WebDriver driver){
        this.driver=driver;

    }
    public void Search() throws InterruptedException {
        driver.navigate().to("https://www.amazon.eg/");
        Thread.sleep(3000);

        driver.findElement(SearchBar).sendKeys("selenium47542");
        driver.findElement(SearchBar).submit();
    }
}

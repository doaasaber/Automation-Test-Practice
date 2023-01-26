package base;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.List;

import static org.openqa.selenium.By.*;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

@BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
      //  driver.get("https://the-internet.herokuapp.com/");
    driver.get("http://cookbook.seleniumacademy.com/");
       // driver.manage().window().fullscreen();
        homePage=new HomePage(driver);


    }
    @AfterClass
    public void terminate(){
        driver.close();


    }


}

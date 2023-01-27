package base;

import Pages.HomePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.internal.TestResult;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import static org.openqa.selenium.By.*;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    public static String downloadPath=System.getProperty("user.dir")+"\\downloads";

@BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver(chromeOptions());
        driver.get("https://the-internet.herokuapp.com/");
    //driver.get("http://cookbook.seleniumacademy.com/");
       // driver.manage().window().fullscreen();
        homePage=new HomePage(driver);


    }
    @AfterClass
    public void terminate(){
        driver.close();


    }

    @AfterMethod
    public void TakeScreenShot(ITestResult result) throws IOException {

    if (ITestResult.FAILURE==result.getStatus()){
        TakesScreenshot ts= (TakesScreenshot) driver;
        File Source=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Source,new File("./Screenshots/" + result.getName() + ".jpg"));
    }
    }
    public static ChromeOptions chromeOptions(){
        ChromeOptions options =new ChromeOptions();
        HashMap<String , Object> chromePerfs=new HashMap<String ,Object>();
        chromePerfs.put("profile.default.content_settings.popups",0);
        chromePerfs.put("download.default_directory",downloadPath);
        options.setExperimentalOption("prefs",chromePerfs);
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        return options;
    }


}

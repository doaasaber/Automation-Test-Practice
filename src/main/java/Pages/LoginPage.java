package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By UserNameField=By.id("username");
    private By PasswordField=By.id("password");
    private By LoginButton=By.cssSelector("#login button");
   public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void setUserNameField(String username) {
        driver.findElement(UserNameField).sendKeys(username);
    }

    public void setPasswordField(String password) {
       driver.findElement(PasswordField).sendKeys(password);
    }

    public SecureArea setLoginButton() {
           driver.findElement(LoginButton).click();
           return new SecureArea(driver);
    }
}

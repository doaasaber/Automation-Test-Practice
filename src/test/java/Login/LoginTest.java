package Login;

import Pages.LoginPage;
import Pages.SecureArea;
import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class LoginTest extends BaseTests {
    @Test
public void testloginsuccessfully(){
    LoginPage login=homePage.ClickFormAuthentication();
    login.setUserNameField("tomsmith");
    login.setPasswordField("SuperSecretPassword!");
    SecureArea secureArea=login.setLoginButton();
    assertTrue(secureArea.GetAlert().contains("You logged into a secure area!"));

}
}
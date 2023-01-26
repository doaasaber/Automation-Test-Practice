package Alerts;

import Pages.AlertsPage;
import base.BaseTests;
import org.testng.annotations.Test;
import  static  org.testng.Assert.*;
public class AlertsTests extends BaseTests {
    @Test
    public void testAlertButton(){
        AlertsPage alertsPage=homePage.ClickOnAlerts();
       var alert= alertsPage.CliclOnAlert();
       assertEquals(alert.getText(),"I am a JS Alert");
        alert.Accept();
       assertEquals( alertsPage.result(),"You successfully clicked an alert");
    }

    @Test
    public void testConfirmButton(){
        AlertsPage alertsPage=homePage.ClickOnAlerts();
        var alert= alertsPage.CliclOnConfirm();
        assertEquals(alert.getText(),"I am a JS Confirm");

        alert.dismiss();
        assertEquals( alertsPage.result(),"You clicked: Cancel");
    }

    @Test
    public void testPromptButton(){
        AlertsPage alertsPage=homePage.ClickOnAlerts();
        var alert= alertsPage.CliclOnPrompt();
        alert.setText("Duo");
        assertEquals(alert.getText(),"I am a JS prompt");
        alert.Accept();
        assertEquals( alertsPage.result(),"You entered: "+"Duo");
    }

}

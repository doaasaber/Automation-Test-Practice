package PagesTests;

import Pages.*;
import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class OtherTest extends BaseTests {
    @Test
    public void DragNDropTest(){
    DragNDropPage dragNDropPage= homePage.DragMe();
    String Text=dragNDropPage.DragNDrop();
    assertEquals(Text,"Dropped!");


    }
    @Test
    public void AlertTest(){
        Alerts alerts=homePage.Alert1();
      String text=  alerts.Alert1();
      assertEquals(text,"Hello! I am an alert box!");
    }

    @Test
    public void ConfirmAlertTest(){
        Alerts alerts=homePage.Alert1();
        String text=  alerts.Confirm();
        assertEquals(text,"You Accepted Alert!");
    }
    @Test
    public void DismissAlertTest(){
        Alerts alerts=homePage.Alert1();
        String text=  alerts.dismiss();
        assertEquals(text,"You Dismissed Alert!");
    }

    @Test
    public void PromptAlertsTesr(){
        Alerts alerts=homePage.Alert1();
        String name="Doaa";
        String text=  alerts.promptAlert(name);
        assertEquals(text,"Hello Doaa! How are you today?");
    }

    @Test
    public void ScrollTest() throws InterruptedException {
        Scroll scroll=homePage.ScrollPage();
       scroll.ScrollPage();
    }

    @Test
    public void ScreenShotTests() throws InterruptedException {
        ScreenShotPage screenShotPage=homePage.ss();
        screenShotPage.Search();
    }


    @Test
    public void Download()  {
        DownloadFilePage downloadFilePage=homePage.downloadFilePage();
        downloadFilePage.DownloadFile();
    }
    @Test
    public void BrokenImageTest(){
        BrokenImgPage brokenImgPage=homePage.brokenImgPage();
        int count=brokenImgPage.ImageBroken();
        assertEquals(count,2);
    }
}

package UploadFile;

import Pages.UploadFilePage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class UploadFileTests extends BaseTests {
    @Test
    public void testUploadFile(){
    UploadFilePage uploadFilePage=homePage.ClickUploadFile();
    uploadFilePage.UploadFile("C:/Users/Duo/IdeaProjects/untitled/drivers/chromedriver.exe");
    assertEquals(uploadFilePage.result(),"chromedriver.exe");
    }

}

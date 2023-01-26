package UploadFile;

import Pages.ExcelSheet;
import Pages.Data;
import base.BaseTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelFileTests extends BaseTests {
    @Test(dataProvider="Data")
    public void testExcelFile(String email,String pass){
        Data uploadFilePage=homePage.Excel();
        uploadFilePage.printData(email,pass);

    }
    @DataProvider(name="Data")
    public Object[][]passData(){
        ExcelSheet config=new ExcelSheet("C:\\Users\\Duo\\IdeaProjects\\untitled\\data.xlsx");
        int rows =config.getRowCount(0);
        Object[][] data=new Object[rows][2];
        for (int i=0;i<rows;i++){
            data[i][0]=config.GetData(0,i,0);
            data[i][1]=config.GetData(0,i,1);

        }
        return data;

    }
}

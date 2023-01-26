package Pages;
import java.io.File;
import  java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelSheet {
    XSSFSheet sheet1;
    XSSFWorkbook wb;
    public ExcelSheet (String path){
        try{
            File src=new File(path);
            FileInputStream fis=new FileInputStream(src);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public String GetData(int sheet,int row,int col){
        sheet1=wb.getSheetAt(sheet);
        String data= String.valueOf(sheet1.getRow(row).getCell(col).getRichStringCellValue());
        return  data;
    }
    public int getRowCount(int sheet){
        int rows=wb.getSheetAt(sheet).getLastRowNum();
        rows+=1;
        return  rows;
    }
}

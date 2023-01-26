package DropDown;

import Pages.DropDownPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.awt.*;
import java.util.List;
public class DropDownTests extends BaseTests {
    @Test

    public void testSelect(){

        DropDownPage dropDownPage=homePage.ClickDropDown();
        dropDownPage.SelectFromDropDown("Option 1");
        List<String> selected=dropDownPage.GetAllSelected();
        assertEquals(selected.size(),1);
        assertTrue(selected.contains("Option 1"));

    }


    @Test
    public void testDoubleClick(){
       DropDownPage dropDownPage= homePage.DoubleClick();
       String color= dropDownPage.DoubleClick();
       assertEquals(color,"rgba(255, 255, 0, 1)");

    }




}

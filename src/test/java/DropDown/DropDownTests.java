package DropDown;

import Pages.DropDownPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.util.List;
@Test
public class DropDownTests extends BaseTests {
    public void testSelect(){
        DropDownPage dropDownPage=homePage.ClickDropDown();
        dropDownPage.SelectFromDropDown("Option 1");
        List<String> selected=dropDownPage.GetAllSelected();
        assertEquals(selected.size(),1);
        assertTrue(selected.contains("Option 1"));

    }


}

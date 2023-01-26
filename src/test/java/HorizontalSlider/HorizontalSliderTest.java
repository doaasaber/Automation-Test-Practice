package HorizontalSlider;

import Pages.HomePage;
import Pages.HorizontalSliderPage;
import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HorizontalSliderTest extends BaseTests {
    @Test
    public void testHorizontalSlider(){
        HorizontalSliderPage horizontal= homePage.ClickOnHorizontalSlider();
        horizontal.ClickonBar();
       assertEquals (horizontal.GetResult(),"1");
    }
}

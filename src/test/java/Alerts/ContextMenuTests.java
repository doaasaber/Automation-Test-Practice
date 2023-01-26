package Alerts;

import Pages.ContextMenuPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
     public void testContextMenu() {
        ContextMenuPage contextMenuPage = homePage.ClickOnContextMenu();
        contextMenuPage.ClickOnBox();
        assertEquals(contextMenuPage.result(),"You selected a context menu");
        contextMenuPage.Confirm();

    }
}

package TestsObjects;

import PagesObjects.CirclePage;
import PagesObjects.PolyLinePage;
import PagesObjects.PolygonPage;
import io.qameta.allure.Attachment;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class EditPolyLineTest extends BaseTest
{
    @Attachment
    @Story("CreatePolyLine")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1, groups = {"sanity-group"})
    public void CreatePolyLine()
    {
        PolyLinePage poly = new PolyLinePage(driver);
        poly.ClickOnPolyLineTab();
        poly.CratePolyLyne();

    }
    @Attachment
    @Story("EditPolyLineCircle")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2, groups = {"sanity-group"})
    public void EditPolyLineCircle()
    {
        PolyLinePage poly = new PolyLinePage(driver);
        poly.ClickOnEditTab();
        poly.EditPolyLine();
    }

}

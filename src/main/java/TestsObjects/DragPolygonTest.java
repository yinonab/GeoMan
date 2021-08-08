package TestsObjects;

import PagesObjects.PolygonPage;
import io.qameta.allure.Attachment;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class DragPolygonTest extends BaseTest
{
    @Attachment
    @Story("CreateCircle")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1, groups = {"sanity-group"})
    public void CreateCircle() {
        PolygonPage poly = new PolygonPage(driver);
        poly.ClickOnPolygonTab();
        poly.CratePolygon();
    }
    @Attachment
    @Story("DragAndDropPolygon")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2, groups = {"sanity-group"})
    public void DragAndDropPolygon()
    {
        PolygonPage poly = new PolygonPage(driver);
        poly.ClickOnDragTab();
        poly.SelectPolygon();
        poly.DragAndDropPoligon();

    }

}

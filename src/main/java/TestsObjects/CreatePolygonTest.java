package TestsObjects;

import PagesObjects.CirclePage;
import PagesObjects.PolygonPage;
import io.qameta.allure.Attachment;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatePolygonTest extends BaseTest
{
    @Attachment
    @Story("CreateCircle")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1, groups = {"sanity-group"})
    public void CreateCircle() {
        PolygonPage poly = new PolygonPage(driver);
        poly.ClickOnPolygonTab();
        poly.CratePolygon();
        Assert.assertTrue(poly.PolygonDisplayed(),"polygon didn't exist");

    }


}

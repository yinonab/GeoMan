package TestsObjects;

import PagesObjects.PolyLinePage;
import io.qameta.allure.Attachment;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatePolyLineTest extends BaseTest
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
        Assert.assertTrue(poly.PolylineDisplayed(),"polyline didn't exist");


    }

}

package TestsObjects;

import PagesObjects.PolyLinePage;
import PagesObjects.ZoomPage;
import io.qameta.allure.Attachment;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class ZoomInTest extends BaseTest
{
    @Attachment
    @Story("ZoomIn")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1, groups = {"sanity-group"})
    public void ZoomIn()
    {
        ZoomPage zoom = new ZoomPage(driver);
        zoom.DoZoomIn();


    }

}

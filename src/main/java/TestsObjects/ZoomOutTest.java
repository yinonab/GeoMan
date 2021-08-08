package TestsObjects;

import PagesObjects.ZoomPage;
import io.qameta.allure.Attachment;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class ZoomOutTest extends BaseTest
{
    @Attachment
    @Story("ZoomOut")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1, groups = {"sanity-group"})
    public void ZoomOut()
    {
        ZoomPage zoom = new ZoomPage(driver);
        zoom.DoZoomOut();


    }

}

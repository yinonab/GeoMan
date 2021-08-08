package TestsObjects;

import PagesObjects.CirclePage;
import io.qameta.allure.Attachment;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateCircleTest extends BaseTest
{
    @Attachment
    @Story("CreateCircle")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1, groups = {"sanity-group"})
    public void CreateCircle()
    {
        CirclePage circle = new CirclePage(driver);
        circle.ClickOnCircleTab();
        circle.CrateCircle();

    }
}

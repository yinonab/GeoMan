package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PolyLinePage extends BasePage
{
    public PolyLinePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@id='map']")
    WebElement map;
    @FindBy(xpath = "//div[@class='control-icon leaflet-pm-icon-polyline']")
    WebElement polylinetab;
    @FindBy(xpath = "//*[name()='svg']/*[name()='g']//*[name()='path' and contains(@class,'leaflet-interactive')]")
    WebElement polyline;
    @FindBy(xpath = "//div[@class='control-icon leaflet-pm-icon-edit']")
    WebElement edittab;
    @FindBy(xpath = "(//div[@class='leaflet-marker-icon marker-icon leaflet-zoom-animated leaflet-interactive leaflet-marker-draggable'])[1]")
    WebElement polylinedot;


public void ClickOnPolyLineTab()
{
    WaitElementDosplayed(polylinetab);
    click(polylinetab);
}
public void CratePolyLyne()
{
    ClickOnMap(map,250,80);
    click(map);
    click(map);
}
public void ClickOnEditTab()
{
    WaitElementDosplayed(edittab);
    click(edittab);
}
public void EditPolyLine()
{
    WaitElementDosplayed(polylinedot);
    click(polylinedot);
    ClickAndHold(polylinedot);
    DragAndDropXY(map,100,250);
    click(edittab);

}
}

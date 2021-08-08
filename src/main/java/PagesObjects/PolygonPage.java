package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PolygonPage extends BasePage
{
    public PolygonPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@id='map']")
    WebElement map;
    @FindBy(xpath = "//div[@class='control-icon leaflet-pm-icon-polygon']")
    WebElement poligontab;
    @FindBy(xpath = "//div[@class='control-icon leaflet-pm-icon-drag']")
    WebElement dragtab;
    @FindBy(xpath = "//div[@class='control-icon leaflet-pm-icon-cut']")
    WebElement catertab;
    @FindBy(xpath = "//*[name()='svg']/*[name()='g']//*[name()='path' and contains(@class,'leaflet-interactive')]")
    WebElement polygon;


public void ClickOnPolygonTab()
{
    WaitElementDosplayed(poligontab);
    click(poligontab);
}
    public void ClickOnCaterTab()
    {
        WaitElementDosplayed(catertab);
        click(catertab);
    }
    public void ClickOnDragTab()
    {
        WaitElementDosplayed(dragtab);
        click(dragtab);
    }
    public void SelectPolygon()
    {
        WaitElementDosplayed(polygon);
        SelectElement(polygon);

        //click(polygon);
    }
public void CratePolygon()
{
    ClickOnMap(map,-200,250);
    click(map);
    ClickOnMap(map,200,350);
    click(map);
    ClickOnMap(map,-200,250);
}
    public void DividePolygon()
    {
        ClickOnMap(map,50,350);
        ClickOnMap(map,100,100);
        ClickOnMap(map,-100,90);
        ClickOnMap(map,50,350);

    }
    public void DragAndDropPoligon()
    {
        WaitElementDosplayed(polygon);
        DragAndDropXY(polygon,150,-350);
    }
    public boolean PolygonDisplayed() {
        try {
            WaitElementDosplayed(polygon);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}

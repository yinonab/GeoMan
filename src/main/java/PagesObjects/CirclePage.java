package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CirclePage extends BasePage
{
    public CirclePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@id='map']")
    WebElement map;
    @FindBy(xpath = "//div[@class='control-icon leaflet-pm-icon-circle']")
    WebElement Circletab;
    @FindBy(xpath = "//*[name()='svg']/*[name()='g']//*[name()='path' and contains(@class,'leaflet-interactive')]")
    WebElement circle;
    @FindBy(xpath = "//div[@class='control-icon leaflet-pm-icon-delete']")
    WebElement deletetab;


public void ClickOnCircleTab()
{
    WaitElementDosplayed(Circletab);
    click(Circletab);
}
public void CrateCircle()
{
    ClickOnMap(map,50,80);
    click(map);
}
public void ClickOnDeleteTab()
{
    WaitElementDosplayed(deletetab);
    click(deletetab);
}
public void DeleteCircle()
{
    WaitElementDosplayed(circle);
    click(circle);
}
    public boolean CircleDisplayed() {
        try {
            WaitElementDosplayed(circle);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

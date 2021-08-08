package PagesObjects;

import org.apache.tools.ant.types.selectors.SelectSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZoomPage extends BasePage
{
    public ZoomPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@id='map']")
    WebElement map;
    @FindBy(xpath = "//div//a[@class='leaflet-control-zoom-in']")
    WebElement zoomintab;
    @FindBy(xpath = "//div//a[@class='leaflet-control-zoom-out']")
    WebElement zoomouttab;
    @FindBy(xpath = "//*[name()='svg']/*[name()='g']//*[name()='path' and contains(@class,'leaflet-interactive')]")
    WebElement circle;
    @FindBy(xpath = "//div[@class='control-icon leaflet-pm-icon-delete']")
    WebElement deletetab;



    public void DoZoomIn()
    {
        WaitElementDosplayed(zoomintab);
        WaitElementClicability(zoomintab);
        while (zoomintab != null)
        {
            click(zoomintab);
            zoomintab = FindControlZoomIn();
        }
    }
    public WebElement FindControlZoomIn() {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div//a[@class='leaflet-control-zoom-in']"));
            return element;
        } catch (Exception e) {
            return null;
        }
    }
    public void DoZoomOut()
    {
        WaitElementDosplayed(zoomouttab);
        WaitElementClicability(zoomouttab);
        while (zoomouttab != null)
        {
            click(zoomouttab);
            zoomouttab = FindControlZoomOut();
        }
    }
    public WebElement FindControlZoomOut() {
        WebElement element = null;
        try {
            element = driver.findElement(By.xpath("//div//a[@class='leaflet-control-zoom-out']"));
            return element;
        } catch (Exception e) {
            return null;
        }
    }
}

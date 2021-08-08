package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BasePage {
    static WebDriver driver;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void click(WebElement el)
    {
        el.click();
    }
    public void ClickOnMap(WebElement element,int x , int y){
        Actions action = new Actions(driver);
        action.moveToElement(element,x,y).
                click().
                perform();
    }
    public void ClickAndHold(WebElement element){
        Actions action = new Actions(driver);
        action.clickAndHold(element).perform();

    }

    public void DragAndDropXY(WebElement element,int x , int y){
        Actions action = new Actions(driver);
        action.dragAndDropBy(element,x,y).
                click().
                perform();

    }

    public void WaitElementDosplayed(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void SelectElement(WebElement element)
    {
        Actions action = new Actions(driver);
        action.click(element);
    }
    public void WaitElementClicability(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void WaitElementNotClicability(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(element)));
    }
    public void sleep(long mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}

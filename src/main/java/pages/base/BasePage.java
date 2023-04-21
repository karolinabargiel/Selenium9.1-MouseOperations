package pages.base;

import configuration.weblistener.WebListener;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.internal.EventFiringMouse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Slf4j
public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;
    private EventFiringMouse eventFiringMouse;
    private WebListener webListener = new WebListener();

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait = new WebDriverWait(driver, Long.parseLong(System.getProperty("browserTimeout")));
        actions = new Actions(driver);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void mouseHover(WebElement element) {
        waitForElementToBeVisible(element);
        eventFiringMouse = new EventFiringMouse(driver, webListener);
        Locatable item = (Locatable) element;
        Coordinates coordinates = item.getCoordinates();
        eventFiringMouse.mouseMove(coordinates);

    }

    public void mouseClick(WebElement element) {
        waitForElementToBeVisible(element);
        eventFiringMouse = new EventFiringMouse(driver, webListener);
        Locatable item = (Locatable) element;
        Coordinates coordinates = item.getCoordinates();
        eventFiringMouse.click(coordinates);

    }


    public void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }


}

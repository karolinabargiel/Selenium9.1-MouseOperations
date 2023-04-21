package configuration.weblistener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class WebListener extends AbstractWebDriverEventListener {

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        System.out.println("Event listener before click");

    }
    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        System.out.println("Event listener after click");

    }

}

package pages.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class ProductPopup extends BasePage {
    public ProductPopup(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li[class='thumb-container'] img[title='Brown bear printed sweater']")
    private WebElement productImageSmall;
    @FindBy(css = ".js-qv-product-cover")
    private WebElement productImageLarge;

    public String getLargeImageTitle() {
        mouseHover(productImageLarge);
        productImageLarge.isDisplayed();
        return productImageLarge.getAttribute("title");
    }

    public ProductPopup clickSmallProductImage() {
        mouseClick(productImageSmall);
        return this;
    }

    public String getSmallProductImageTitle() {
        return productImageSmall.getAttribute("title");
    }


}

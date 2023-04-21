package pages.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class WomenCategoryPage extends BasePage {
    public WomenCategoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".thumbnail.product-thumbnail")
    private WebElement productIcon;
    @FindBy(css = ".quick-view")
    private WebElement quickViewBtn;

    public WomenCategoryPage hoverOnProduct() {
        mouseHover(productIcon);
        return this;
    }

    public ProductPopup clickOnQuickView() {
        click(quickViewBtn);
        return new ProductPopup(driver);
    }


}

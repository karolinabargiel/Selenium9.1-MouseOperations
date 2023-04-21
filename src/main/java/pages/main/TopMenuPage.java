package pages.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;


public class TopMenuPage extends BasePage {
    public TopMenuPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "#category-3")
    private WebElement clothesCategory;
    @FindBy(css = "#category-5")
    private WebElement womenSubCategory;

    public TopMenuPage hoverOnClothesCategory() {
        mouseHover(clothesCategory);
        return this;
    }

    public WomenCategoryPage clickOnWomenCategory() {
        click(womenSubCategory);
        return new WomenCategoryPage(driver);
    }


}

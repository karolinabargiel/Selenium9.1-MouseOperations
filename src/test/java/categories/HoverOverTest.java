package categories;

import base.TestBase;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.main.ProductPopup;
import pages.main.TopMenuPage;
import pages.main.WomenCategoryPage;

public class HoverOverTest extends TestBase {

    TopMenuPage topMenuPage;
    WomenCategoryPage womenCategoryPage;
    ProductPopup productPopup;

    @BeforeEach
    public void testSetup() {
        topMenuPage= new TopMenuPage(driver);
        womenCategoryPage = new WomenCategoryPage(driver);
        productPopup = new ProductPopup(driver);
    }

    @Test
    public void shouldNavigateOnTopMenu() {
        topMenuPage.hoverOnClothesCategory()
                .clickOnWomenCategory()
                .hoverOnProduct()
                .clickOnQuickView()
                .clickSmallProductImage();
        Assertions.assertThat(productPopup.getSmallProductImageTitle()).isEqualTo(productPopup.getLargeImageTitle());

    }

}

package webstaurantStore.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import webstaurantStore.Page.Cart_page;
import webstaurantStore.Page.Search_page;
import webstaurantStore.Utilities.ConfigurationReader;
import webstaurantStore.Utilities.Driver;
import webstaurantStore.baseURL.HomepageUrl;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public abstract class AddItemToCart_test extends HomepageUrl {


    Search_page searchPage = new Search_page();
    Cart_page cartPage = new Cart_page();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));


    @BeforeMethod
    public void searching(){
        searchPage.searchButton.sendKeys(ConfigurationReader.getProperty("searchFor"));
        searchPage.searchButtonClick.click();
    }
    @Test
    public void addToCartLastItem() throws InterruptedException {

        searchPage.lastPageButton.click();
        Thread.sleep(2000);

        List<WebElement> toCart = new ArrayList<>();

        for (WebElement eachCart : searchPage.addToCartButton) {
            toCart.add(eachCart);
        }

        toCart.get(toCart.size() - 1).click();


        Assert.assertTrue(cartPage.cartMessage.isDisplayed(), "Cart may be empty or message just wasn't displayed");




    }
}

package webstaurantStore.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import webstaurantStore.Page.Search_page;
import webstaurantStore.Utilities.Driver;
import webstaurantStore.baseURL.HomepageUrl;

import java.time.Duration;

public class Search_test extends HomepageUrl {

    Search_page searchPage = new Search_page();
    String searchFor = "stainless work table";

    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Test
    public void searchWorkTable() throws InterruptedException {

        searchPage.searchButton.sendKeys(searchFor);
        searchPage.searchButtonClick.click();

        for (WebElement each : searchPage.pages) {
          actions.moveToElement(searchPage.buttonOfThePage).perform();




        }


    }


}

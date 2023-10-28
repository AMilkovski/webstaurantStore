package webstaurantStore.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import webstaurantStore.Page.Search_page;
import webstaurantStore.Utilities.ConfigurationReader;
import webstaurantStore.Utilities.Driver;
import webstaurantStore.baseURL.HomepageUrl;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Search_test extends HomepageUrl {

    Search_page searchPage = new Search_page();

    @BeforeMethod
    public void searching(){
        searchPage.searchButton.sendKeys(ConfigurationReader.getProperty("searchFor"));
        searchPage.searchButtonClick.click();
    }

    @Test
    public void searchWorkTable() throws InterruptedException {

        List<String> allItems = new ArrayList<>();

        int numOfPages = Integer.parseInt(searchPage.lastPageButton.getText());

        for (int i = 1; i <= numOfPages; i++) {
            for (WebElement eachItem : searchPage.allItemsFromList) {
                allItems.add(eachItem.getText());
            }

            searchPage.nextPageButton.click();
        }

        System.out.println("Total items searched: "+allItems.size());

        for (String eachItem : allItems) {

            if (!eachItem.contains(ConfigurationReader.getProperty("hasWord"))){
                System.err.println("Wrong title / List of wrong titles: " + eachItem);
            }

           Assert.assertTrue(eachItem.contains(ConfigurationReader.getProperty("hasWord")), "Some items does not contain \"Table\"");

        }



    }


}

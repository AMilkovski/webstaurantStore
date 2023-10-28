package webstaurantStore.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webstaurantStore.Utilities.Driver;

import java.util.List;

public class Search_page {

    public Search_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "searchval")
    public WebElement searchButton;

    @FindBy(xpath = "(//button[contains(@class,'text-white hidden')])[1]")
    public WebElement searchButtonClick;


    @FindBy(xpath = "//div[@id='ProductBoxContainer']/div/a/span")
    public List<WebElement> allItemsFromList;

    @FindBy(xpath = "//li[@class='inline-block leading-4 align-top rounded-r-md']")
    public WebElement nextPageButton;

    @FindBy(xpath = "//a[contains(@aria-label,'last page')]")
    public WebElement lastPageButton;

    @FindBy(xpath = "//input[@name=\"addToCartButton\"]")
    public List<WebElement> addToCartButton;




}

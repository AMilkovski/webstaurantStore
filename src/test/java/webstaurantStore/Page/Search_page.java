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

    /*
    @FindBy()
    public WebElement searchButton;
*/
    @FindBy(xpath = "//div[@id='paging']")
    public WebElement buttonOfThePage;

    @FindBy(xpath = "//ul[contains(@class, 'rounded-md inline-block font-semibold')]/li")
    public List<WebElement> pages;




}

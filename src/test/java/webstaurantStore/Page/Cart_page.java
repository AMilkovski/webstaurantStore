package webstaurantStore.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webstaurantStore.Utilities.Driver;

public class Cart_page {

    public Cart_page (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='group flex flex-nowrap rounded-tl rounded-bl overflow-hidden']" )
    public WebElement cartLogo;

    @FindBy(xpath = "//button[.='Empty Cart']" )
    public WebElement EmptyCartButton;


    @FindBy(xpath = "//div[@id='watnotif-wrapper']")
    public WebElement cartMessage;

    @FindBy(xpath = "(//footer[contains(@class,'bg-gray-50 border-gray-200')]/button)[1]")
    public WebElement confirmEmptyCartButton;

    @FindBy(xpath = "//p[.='Your cart is empty.']")
    public WebElement yourCartIzEmptyMessage;





}

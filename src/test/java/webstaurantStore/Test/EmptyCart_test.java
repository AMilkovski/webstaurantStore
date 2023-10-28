package webstaurantStore.Test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import webstaurantStore.Page.Cart_page;

public class EmptyCart_test extends AddItemToCart_test{



    @Test
    public void removeFromCart () throws InterruptedException {

        cartPage.cartLogo.click();

        cartPage.EmptyCartButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(cartPage.confirmEmptyCartButton));

        cartPage.confirmEmptyCartButton.click();

        Assert.assertTrue(cartPage.yourCartIzEmptyMessage.isDisplayed(), "Cart is not empty");


    }

}

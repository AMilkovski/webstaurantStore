package webstaurantStore.baseURL;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import webstaurantStore.Utilities.Driver;

public abstract class HomepageUrl {

    @BeforeMethod
    public void setUp(){

        Driver.getDriver().get("https://www.webstaurantstore.com/");

    }

    @AfterMethod
    public void teardown(){
        Driver.getDriver().close();
    }


}
